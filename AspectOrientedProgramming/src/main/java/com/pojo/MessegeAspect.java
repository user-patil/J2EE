package com.pojo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessegeAspect {

	@Before("execution (* com.pojo.Recharge.*())")
	public void beforeMsg() {
		System.err.println("aagayaa...aagayyaa  Dil churane Me Aagayaa");
	}

	@After("execution(* com.pojo.Recharge.*())")
	public void afterMsg() {
		System.err.println("chalo to me chalata hu....");

	}
}
