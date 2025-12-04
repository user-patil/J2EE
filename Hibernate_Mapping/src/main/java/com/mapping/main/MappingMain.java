package com.mapping.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.oneToOneMapping.Cab;
import com.oneToOneMapping.NewDriver;

public class MappingMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Cab.class);
		cfg.addAnnotatedClass(NewDriver.class);
		

		SessionFactory sf=cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		Cab c=new Cab();
		c.setCabColor("black");
		c.setModelName("Defender");
		
		
		ss.persist(c);
		
		NewDriver nd=new NewDriver(); 
		nd.setDriverID(122);
		nd.setDriverName("nikhil");
		nd.setGender("male");
		nd.setC(c);
		ss.persist(nd);
		
		System.out.println("data inserted......!");
		tr.commit();
		ss.close();
		
		
		
	}
}
