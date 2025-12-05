package com.SimPojo;

import org.springframework.stereotype.Component;

@Component("SimJio")
public class jio implements Sim{

	@Override
	public String calling() {
		
		return "Calling from jio sim";
	}

}
