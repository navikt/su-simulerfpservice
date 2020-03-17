
package os.tjenester.simulerfpservice.simulerfpservicegrensesnitt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="request" type="{http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceServiceTypes}sendInnOppdragRequest"/&gt;
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
    "request"
})
@XmlRootElement(name = "sendInnOppdragRequest")
public class SendInnOppdragRequest {

    @XmlElement(required = true)
    protected os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest }
     *     
     */
    public os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest }
     *     
     */
    public void setRequest(os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest value) {
        this.request = value;
    }

}
