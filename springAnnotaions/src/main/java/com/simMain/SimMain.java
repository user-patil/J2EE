package com.simMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SimPojo.Caller;
import com.SimPojo.SimConfig;

public class SimMain {
public static void main(String[] args) {
	
	
	ApplicationContext context =new AnnotationConfigApplicationContext(SimConfig.class);
	Caller c= context.getBean(Caller.class);
	System.out.println(c.getS1().calling());
	System.out.println(c.getS2().calling());
}
}
