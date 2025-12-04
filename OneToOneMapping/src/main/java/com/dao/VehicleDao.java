package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oto_entities.Customer;
import com.oto_entities.ShowRoom;
import com.oto_entities.Vehicle;

public class VehicleDao {
	
	public void dao(ShowRoom sr,Vehicle v,Customer c) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class); 
		cfg.addAnnotatedClass(ShowRoom.class);
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.persist(sr);
		ss.persist(v);
		ss.persist(c);

		tr.commit();
		ss.close();

	}
}
