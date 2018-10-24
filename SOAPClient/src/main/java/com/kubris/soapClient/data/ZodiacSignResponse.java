
package com.kubris.soapClient.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zodiacSignResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zodiacSignResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zodiacSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zodiacSignResponse", propOrder = {
    "zodiacSign"
})
public class ZodiacSignResponse {

    protected String zodiacSign;

    /**
     * Gets the value of the zodiacSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZodiacSign() {
        return zodiacSign;
    }

    /**
     * Sets the value of the zodiacSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZodiacSign(String value) {
        this.zodiacSign = value;
    }

}
