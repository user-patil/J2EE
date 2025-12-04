package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class Insertdeta {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee ee = new Employee();
		ee.setName("shubham");
		ee.setCity("pune");
	    ee.setEmpId(101);
		ee.setAge(25);
		ee.setEmpAdd("at post keshegaon");

		//ss.save(s);
        ss.persist(ee);

		System.out.println("Data is Inserted.... !");

		tr.commit();
		ss.close();
		
		
	}

}
