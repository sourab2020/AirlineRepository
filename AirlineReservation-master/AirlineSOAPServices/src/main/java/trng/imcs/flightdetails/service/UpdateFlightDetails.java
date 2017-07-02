
package trng.imcs.flightdetails.service;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDetailsUpdateRequest" type="{http://www.example.org/FlightDetailsService/}flightDetailsUpdateRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightDetailsUpdateRequest"
})
@XmlRootElement(name = "updateFlightDetails")
public class UpdateFlightDetails {

    @XmlElement(required = true)
    protected FlightDetailsUpdateRequestType flightDetailsUpdateRequest;

    /**
     * Gets the value of the flightDetailsUpdateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsUpdateRequestType }
     *     
     */
    public FlightDetailsUpdateRequestType getFlightDetailsUpdateRequest() {
        return flightDetailsUpdateRequest;
    }

    /**
     * Sets the value of the flightDetailsUpdateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsUpdateRequestType }
     *     
     */
    public void setFlightDetailsUpdateRequest(FlightDetailsUpdateRequestType value) {
        this.flightDetailsUpdateRequest = value;
    }

}
