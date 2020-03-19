
package no.nav.os.system.tjenester.simulerfpservice.simulerfpserviceservicetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.nav.os.system.entiteter.infomelding.Infomelding;


/**
 * <p>Java class for sendInnOppdragResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendInnOppdragResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oppdrag" type="{http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceServiceTypes}oppdrag" minOccurs="0"/&gt;
 *         &lt;element name="infomelding" type="{http://nav.no/system/os/entiteter/infomelding}infomelding" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendInnOppdragResponse", propOrder = {
    "oppdrag",
    "infomelding"
})
public class SendInnOppdragResponse {

    protected Oppdrag oppdrag;
    protected Infomelding infomelding;

    /**
     * Gets the value of the oppdrag property.
     * 
     * @return
     *     possible object is
     *     {@link Oppdrag }
     *     
     */
    public Oppdrag getOppdrag() {
        return oppdrag;
    }

    /**
     * Sets the value of the oppdrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oppdrag }
     *     
     */
    public void setOppdrag(Oppdrag value) {
        this.oppdrag = value;
    }

    /**
     * Gets the value of the infomelding property.
     * 
     * @return
     *     possible object is
     *     {@link Infomelding }
     *     
     */
    public Infomelding getInfomelding() {
        return infomelding;
    }

    /**
     * Sets the value of the infomelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Infomelding }
     *     
     */
    public void setInfomelding(Infomelding value) {
        this.infomelding = value;
    }

}