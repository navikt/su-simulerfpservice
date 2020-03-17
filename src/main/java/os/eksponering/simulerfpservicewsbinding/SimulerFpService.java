
package os.eksponering.simulerfpservicewsbinding;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.SendInnOppdragRequest;
import os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.SendInnOppdragResponse;
import os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.SimulerBeregningRequest;
import os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.SimulerBeregningResponse;
import os.tjenester.simulerfpservice.feil.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "simulerFpService", targetNamespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    os.tjenester.simulerfpservice.simulerfpserviceservicetypes.ObjectFactory.class,
    os.entiteter.beregningskjema.ObjectFactory.class,
    os.entiteter.infomelding.ObjectFactory.class,
    os.entiteter.oppdragskjema.ObjectFactory.class,
    ObjectFactory.class,
    os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.ObjectFactory.class,
    os.entiteter.typer.simpletypes.ObjectFactory.class
})
public interface SimulerFpService {


    /**
     * Operasjonen tilbyr innsending og registrering av ny/endret oppdrag som følge av nytt/endring på vedtak
     * 
     * @param parameters
     * @return
     *     returns no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.SendInnOppdragResponse
     * @throws SendInnOppdragFeilUnderBehandling
     */
    @WebMethod
    @WebResult(name = "sendInnOppdragResponse", targetNamespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", partName = "parameters")
    public SendInnOppdragResponse sendInnOppdrag(
        @WebParam(name = "sendInnOppdragRequest", targetNamespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", partName = "parameters")
        SendInnOppdragRequest parameters)
        throws SendInnOppdragFeilUnderBehandling
    ;

    /**
     * Operasjonen tilbyr simuleringsberegning
     * 
     * @param parameters
     * @return
     *     returns no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.SimulerBeregningResponse
     * @throws SimulerBeregningFeilUnderBehandling
     */
    @WebMethod
    @WebResult(name = "simulerBeregningResponse", targetNamespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", partName = "parameters")
    public SimulerBeregningResponse simulerBeregning(
        @WebParam(name = "simulerBeregningRequest", targetNamespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", partName = "parameters")
        SimulerBeregningRequest parameters)
        throws SimulerBeregningFeilUnderBehandling
    ;

}
