package com.carPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarMain {
	public static void main(String[] args) {
       
		ApplicationContext context =new AnnotationConfigApplicationContext(CarConfig.class);
		CarBooking cb= context.getBean(CarBooking.class);
		cb.cotation();
		
	}
}
