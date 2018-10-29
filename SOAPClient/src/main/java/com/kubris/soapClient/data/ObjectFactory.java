
package com.kubris.soapClient.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kubris.soapClient.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSign_QNAME = new QName("http://soapservice.demo.com/", "getSign");
    private final static QName _GetSignResponse_QNAME = new QName("http://soapservice.demo.com/", "getSignResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kubris.soapClient.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSign }
     * 
     */
    public GetSign createGetSign() {
        return new GetSign();
    }

    /**
     * Create an instance of {@link GetSignResponse }
     * 
     */
    public GetSignResponse createGetSignResponse() {
        return new GetSignResponse();
    }

    /**
     * Create an instance of {@link PersonInput }
     * 
     */
    public PersonInput createPersonInput() {
        return new PersonInput();
    }

    /**
     * Create an instance of {@link ZodiacSignResponse }
     * 
     */
    public ZodiacSignResponse createZodiacSignResponse() {
        return new ZodiacSignResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapservice.demo.com/", name = "getSign")
    public JAXBElement<GetSign> createGetSign(GetSign value) {
        return new JAXBElement<GetSign>(_GetSign_QNAME, GetSign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapservice.demo.com/", name = "getSignResponse")
    public JAXBElement<GetSignResponse> createGetSignResponse(GetSignResponse value) {
        return new JAXBElement<GetSignResponse>(_GetSignResponse_QNAME, GetSignResponse.class, null, value);
    }

}
