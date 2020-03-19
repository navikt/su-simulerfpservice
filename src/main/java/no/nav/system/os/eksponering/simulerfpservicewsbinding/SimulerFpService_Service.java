
package no.nav.system.os.eksponering.simulerfpservicewsbinding;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "simulerFpService", targetNamespace = "http://nav.no/system/os/eksponering/simulerFpServiceWSBinding", wsdlLocation = "file:/Users/h131243/src/su/su-simulerfpservice/src/main/resources/wsdl/no/nav/system/no.nav.os/eksponering/simulerFpServiceWSBinding.wsdl")
public class SimulerFpService_Service
    extends Service
{

    private final static URL SIMULERFPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIMULERFPSERVICE_EXCEPTION;
    private final static QName SIMULERFPSERVICE_QNAME = new QName("http://nav.no/system/os/eksponering/simulerFpServiceWSBinding", "simulerFpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/h131243/src/su/su-simulerfpservice/src/main/resources/wsdl/no/nav/system/os/eksponering/simulerFpServiceWSBinding.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMULERFPSERVICE_WSDL_LOCATION = url;
        SIMULERFPSERVICE_EXCEPTION = e;
    }

    public SimulerFpService_Service() {
        super(__getWsdlLocation(), SIMULERFPSERVICE_QNAME);
    }

    public SimulerFpService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMULERFPSERVICE_QNAME, features);
    }

    public SimulerFpService_Service(URL wsdlLocation) {
        super(wsdlLocation, SIMULERFPSERVICE_QNAME);
    }

    public SimulerFpService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMULERFPSERVICE_QNAME, features);
    }

    public SimulerFpService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimulerFpService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SimulerFpService
     */
    @WebEndpoint(name = "simulerFpServicePort")
    public SimulerFpService getSimulerFpServicePort() {
        return super.getPort(new QName("http://nav.no/system/os/eksponering/simulerFpServiceWSBinding", "simulerFpServicePort"), SimulerFpService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimulerFpService
     */
    @WebEndpoint(name = "simulerFpServicePort")
    public SimulerFpService getSimulerFpServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://nav.no/system/os/eksponering/simulerFpServiceWSBinding", "simulerFpServicePort"), SimulerFpService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMULERFPSERVICE_EXCEPTION!= null) {
            throw SIMULERFPSERVICE_EXCEPTION;
        }
        return SIMULERFPSERVICE_WSDL_LOCATION;
    }

}
