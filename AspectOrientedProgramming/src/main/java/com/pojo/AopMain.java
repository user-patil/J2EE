package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {
	public static void main(String[] args) {
      
		ApplicationContext context = new AnnotationConfigApplicationContext(MyRechargeConfig.class);
		Recharge r = context.getBean(Recharge.class);
		r.recharge();
	}
}
