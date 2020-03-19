package no.nav.su.simuler

import no.nav.system.os.eksponering.simulerfpservicewsbinding.SimulerFpService
import org.apache.cxf.Bus
import org.apache.cxf.binding.soap.Soap12
import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.bus.extension.ExtensionManagerBus
import org.apache.cxf.configuration.jsse.TLSClientParameters
import org.apache.cxf.endpoint.Client
import org.apache.cxf.ext.logging.LoggingFeature
import org.apache.cxf.frontend.ClientProxy
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean
import org.apache.cxf.transport.http.HTTPConduit
import org.apache.cxf.ws.addressing.WSAddressingFeature
import org.apache.cxf.ws.policy.PolicyBuilder
import org.apache.cxf.ws.policy.PolicyEngine
import org.apache.cxf.ws.policy.attachment.reference.RemoteReferenceResolver
import org.apache.cxf.ws.security.SecurityConstants
import org.apache.cxf.ws.security.trust.STSClient
import org.apache.neethi.Policy
import javax.xml.namespace.QName

internal class SOAPFactory {
    companion object {
        private const val WSDL = "wsdl/no/nav/system/os/eksponering/simulerFpServiceWSBinding.wsdl"
        private const val NAMESPACE = "http://nav.no/system/no.nav.os/eksponering/simulerFpServiceWSBinding"
        private val SERVICE = QName(NAMESPACE, "simulerFpService")
        private val PORT = QName(NAMESPACE, "simulerFpServicePort")
        private const val STS_CLIENT_AUTHENTICATION_POLICY = "classpath:untPolicy.xml"
        private const val STS_SAML_POLICY = "classpath:requestSamlPolicy.xml"
    }

    fun build(
        serviceUrl: String,
        stsUrl: String,
        username: String,
        password: String
    ): SimulerFpService = JaxWsProxyFactoryBean().apply {
        address = serviceUrl
        wsdlURL = WSDL
        serviceName = SERVICE
        endpointName = PORT
        serviceClass = SimulerFpService::class.java
        features = listOf(WSAddressingFeature(), LoggingFeature())
    }.create(SimulerFpService::class.java).apply {
        val bus = ExtensionManagerBus()
        val sts = STSClient(bus).apply {
            isEnableAppliesTo = false
            isAllowRenewing = false

            location = stsUrl
            properties = mapOf(
                SecurityConstants.USERNAME to username,
                SecurityConstants.PASSWORD to password
            )
            setPolicy(bus.resolvePolicy(STS_CLIENT_AUTHENTICATION_POLICY))
        }
        ClientProxy.getClient(this).apply {
            requestContext[SecurityConstants.STS_CLIENT] = sts
            requestContext[SecurityConstants.CACHE_ISSUED_TOKEN_IN_ENDPOINT] = true
            setClientEndpointPolicy(bus.resolvePolicy(STS_SAML_POLICY))
            (conduit as HTTPConduit).tlsClientParameters = TLSClientParameters().apply {
                isDisableCNCheck = true
            }
        }
    }
}

private fun Bus.resolvePolicy(policyUri: String): Policy {
    val registry = getExtension(PolicyEngine::class.java).registry
    val resolved = registry.lookup(policyUri)

    val policyBuilder = getExtension(PolicyBuilder::class.java)
    val referenceResolver = RemoteReferenceResolver("", policyBuilder)

    return resolved ?: referenceResolver.resolveReference(policyUri)
}

private fun Client.setClientEndpointPolicy(policy: Policy) {
    val policyEngine: PolicyEngine = bus.getExtension(PolicyEngine::class.java)
    val message = SoapMessage(Soap12.getInstance())
    val endpointPolicy = policyEngine.getClientEndpointPolicy(endpoint.endpointInfo, null, message)
    policyEngine.setClientEndpointPolicy(endpoint.endpointInfo, endpointPolicy.updatePolicy(policy, message))
}