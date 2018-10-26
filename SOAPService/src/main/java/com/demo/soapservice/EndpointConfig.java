package com.demo.soapservice;

import javax.xml.ws.Endpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EndpointConfig {

	/**
	 * This method publishes PersonImpl
	 */
	@Bean
	public void startSOAP() {
		//Change IP address,put IP address of you computer
		Endpoint.publish("http://localhost:8001/zodiacSign", new PersonImpl());
	}
	
}
