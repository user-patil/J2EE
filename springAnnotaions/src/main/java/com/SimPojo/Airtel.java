package com.SimPojo;

import org.springframework.stereotype.Component;

@Component("SimAirtel")
public class Airtel implements Sim{

	@Override
	public String calling() {
		
		return "Calling from Airtel sim";
	}

}
