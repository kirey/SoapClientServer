package com.demo.soapservice;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

/**
 * In this class we implement interface Person and add logic to methods
 * @author jovanovicn
 *
 */
@WebService
public class PersonImpl implements Person {

	
	private Map<PersonInput,ZodiacSignResponse> fakeData = new HashMap<PersonInput,ZodiacSignResponse>();
	
	public PersonImpl() {
		//adding fake data just to have to work with 
		fakeData.put(new PersonInput("Nikola","Jovanovic","March"), new ZodiacSignResponse("Pisces"));
		fakeData.put(new PersonInput("Milos","Paunovic","September"), new ZodiacSignResponse("Virgo"));
		fakeData.put(new PersonInput("Miljan","Stojanovic","February"), new ZodiacSignResponse("Taurus"));
	}
	
	public ZodiacSignResponse getSign(PersonInput personInput) {
		//logic to return response,just for testing
		if(personInput.getMonthOfBorn().equals("March")) {
			return new ZodiacSignResponse("Pisces");
		}else if(personInput.getMonthOfBorn().equals("September")) {
			return new ZodiacSignResponse("Virgo");
		}
		else if(personInput.getMonthOfBorn().equals("February")){
			return  new ZodiacSignResponse("Taurus");
		}
		return new ZodiacSignResponse("Don't know the zodiac sign!");
	}

	@Override
	public ZodiacSignResponse getAttitude(PersonInput personInput) {
		return new ZodiacSignResponse("rrrrrrr");
	}

	
}
