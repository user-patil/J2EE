package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.InterviewPojo.ConfigClass;
import com.InterviewPojo.Person;

public class InterviewMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Person p = context.getBean(Person.class);
		System.out.println(p.getIntr1().testTiming());
		System.out.println(p.getIntr2().testTiming());

	}
}
