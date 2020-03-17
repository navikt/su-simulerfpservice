
package os.eksponering.simulerfpservicewsbinding;

import javax.xml.ws.WebFault;
import os.tjenester.simulerfpservice.feil.FeilUnderBehandling;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "sendInnOppdragFeilUnderBehandling", targetNamespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt")
public class SendInnOppdragFeilUnderBehandling
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FeilUnderBehandling faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SendInnOppdragFeilUnderBehandling(String message, FeilUnderBehandling faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SendInnOppdragFeilUnderBehandling(String message, FeilUnderBehandling faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: no.nav.system.os.tjenester.simulerfpservice.feil.FeilUnderBehandling
     */
    public FeilUnderBehandling getFaultInfo() {
        return faultInfo;
    }

}
