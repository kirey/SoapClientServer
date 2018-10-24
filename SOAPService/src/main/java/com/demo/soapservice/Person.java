package com.demo.soapservice;

import javax.jws.WebMethod;
import javax.jws.WebService;


/**
 * In this class we define our methods 
 * @author jovanovicn
 *
 */
@WebService
public interface Person {
 
    @WebMethod
    ZodiacSignResponse getSign(PersonInput personInput);
 
}