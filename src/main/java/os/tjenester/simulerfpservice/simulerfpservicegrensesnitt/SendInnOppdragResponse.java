
package os.tjenester.simulerfpservice.simulerfpservicegrensesnitt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceServiceTypes}sendInnOppdragResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response"
})
@XmlRootElement(name = "sendInnOppdragResponse")
public class SendInnOppdragResponse {

    protected os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragResponse response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragResponse }
     *     
     */
    public os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragResponse }
     *     
     */
    public void setResponse(os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragResponse value) {
        this.response = value;
    }

}
