package com.demo.soapservice;

import javax.xml.bind.annotation.XmlType;


/**
 * This class is response from SOAP Service
 * @author jovanovicn
 *
 */
public class ZodiacSignResponse {
	
	private String zodiacSign;
	
	public ZodiacSignResponse(String zodiacSign) {
		super();
		this.zodiacSign = zodiacSign;
	}

	public String getZodiacSign() {
		return zodiacSign;
	}

	public void setZodiacSign(String zodiacSign) {
		this.zodiacSign = zodiacSign;
	}


}
