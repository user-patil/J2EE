package com.carPkg;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessegeAspect {
	@Before("execution(* com.carPkg.CarBooking.*(..))")
	public void before() {
		System.out.println("car booking is done...!");
	}

	@After("execution(* com.carPkg.CarBooking.*(..))")
	public void after() {
		System.out.println("payment Settlement is done...!");
	}

}
