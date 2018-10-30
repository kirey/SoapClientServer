package com.kubris.soapClient.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kubris.soapClient.data.Person;
import com.kubris.soapClient.data.PersonImplService;
import com.kubris.soapClient.data.PersonInput;
import com.kubris.soapClient.data.ZodiacSignResponse;

@RestController
@RequestMapping("/rest")
public class TestController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String test() {
		return "test";
	}
	
	/**
	 * Controller for testing SOAP call
	 * @return {@link ZodiacSignResponse}
	 */
	@RequestMapping(value = "/soap", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object performSoap() {
		//service element represents the Web service for which the generated service interface provides a client view
		PersonImplService service = new PersonImplService();
		//wsdl:port element inside a wsdl:service
		//The getPort method returns a proxy. A service client uses this proxy to invoke operations on the target service endpoint.
		Person serviceEndpoint = service.getPersonImplPort();
		
		//build input parameter
		PersonInput input = new PersonInput();
		input.setLastName("Paunovic");
		input.setName("Milos");
		input.setMonthOfBorn("September");
		
		//target service endpoint which returns response output
		ZodiacSignResponse response = serviceEndpoint.getSign(input);
		
		return response;
	}
	
	
	@RequestMapping(value = "/sss", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object performSoap2() {
		//service element represents the Web service for which the generated service interface provides a client view
		PersonImplService service = new PersonImplService();
		//wsdl:port element inside a wsdl:service
		//The getPort method returns a proxy. A service client uses this proxy to invoke operations on the target service endpoint.
		Person serviceEndpoint = service.getPersonImplPort();
		
		//build input parameter
		PersonInput input = new PersonInput();
		input.setLastName("Paunovic");
		input.setName("Milos");
		input.setMonthOfBorn("September");
		
		//target service endpoint which returns response output
		ZodiacSignResponse response = serviceEndpoint.getAttitude(input);
		
		return response;
	}
	

}
