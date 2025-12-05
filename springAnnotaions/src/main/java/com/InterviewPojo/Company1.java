package com.InterviewPojo;

import org.springframework.stereotype.Component;

@Component("cmp1")
public class Company1 implements Interview {

	@Override
	public String testTiming() {
	
		return " Test timing = 1:30  to 5:00";
	}
	
	
}
