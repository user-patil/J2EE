package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.VoterId;

public class InsertData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(VoterId.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		VoterId v = new VoterId();
		v.setName("shubham");
		v.setAddress("pune");
		v.setAge(28);
		v.setGender("male");

		// ss.save(v);
		ss.persist(v);

		System.out.println("Data is Inserted.... !");

		tr.commit();
		ss.close();
	}
}
