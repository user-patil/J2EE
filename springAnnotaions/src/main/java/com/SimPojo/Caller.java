package com.SimPojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Caller {
	@Autowired
	@Qualifier("SimJio")
	Sim s1;
	@Autowired
	@Qualifier("SimAirtel")
	Sim s2;

	public Sim getS1() {
		return s1;
	}

	public void setS1(Sim s1) {
		this.s1 = s1;
	}

	public Sim getS2() {
		return s2;
	}

	public void setS2(Sim s2) {
		this.s2 = s2;
	}

	public Caller(Sim s1, Sim s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public Caller() {

	}

	@Override
	public String toString() {
		return "Caller [s1=" + s1 + ", s2=" + s2 + "]";
	}

}
