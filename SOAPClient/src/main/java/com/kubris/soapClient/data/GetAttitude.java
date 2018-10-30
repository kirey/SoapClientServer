
package com.kubris.soapClient.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAttitude complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAttitude">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://soapservice.demo.com/}personInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAttitude", propOrder = {
    "arg0"
})
public class GetAttitude {

    protected PersonInput arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInput }
     *     
     */
    public PersonInput getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInput }
     *     
     */
    public void setArg0(PersonInput value) {
        this.arg0 = value;
    }

}
