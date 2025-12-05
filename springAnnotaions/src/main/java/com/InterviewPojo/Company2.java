package com.InterviewPojo;

import org.springframework.stereotype.Component;

@Component("cmp2")
public class Company2 implements Interview {

	@Override
	public String testTiming() {

		return " Test timing = 10:30  to 1:00";
	}
}
