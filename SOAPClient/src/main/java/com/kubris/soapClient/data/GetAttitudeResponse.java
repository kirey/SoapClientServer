
package com.kubris.soapClient.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAttitudeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAttitudeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soapservice.demo.com/}zodiacSignResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAttitudeResponse", propOrder = {
    "_return"
})
public class GetAttitudeResponse {

    @XmlElement(name = "return")
    protected ZodiacSignResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ZodiacSignResponse }
     *     
     */
    public ZodiacSignResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZodiacSignResponse }
     *     
     */
    public void setReturn(ZodiacSignResponse value) {
        this._return = value;
    }

}
