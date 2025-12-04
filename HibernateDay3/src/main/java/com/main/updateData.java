package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.VoterId;

public class updateData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(VoterId.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int stud_id = 1;
		VoterId v = ss.get(VoterId.class, stud_id);

		v.setAge(29);
		v.setAddress("nsk");
		v.setName("amol");
		v.setGender("male");

//		ss.update(s);
		ss.merge(v);

		System.out.println("Data id udated ... ! ");
		tr.commit();
		ss.close();

	}
}
