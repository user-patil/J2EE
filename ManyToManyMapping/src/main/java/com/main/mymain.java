package com.main;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Customers;
import com.entities.Products;

public class mymain {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customers.class);
		cfg.addAnnotatedClass(Products.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Customers c1 = new Customers();
		c1.setC_Name("ashish");
		c1.setC_phoneNumber("9356935815");
		c1.setP(null);

		Customers c2 = new Customers();
		c2.setC_Name("ashish");
		c2.setC_phoneNumber("9356935815");
		c2.setP(null);

		Customers c3 = new Customers();
		c3.setC_Name("ashish");
		c3.setC_phoneNumber("9356935815");
		c3.setP(null);
		
		List<Customers> c=new ArrayList<Customers>();
		c.add(c1);
		c.add(c2);
		c.add(c3);

		Products p1 = new Products();
		p1.setProduct_no(111);
		p1.setProduct_name("dettol");
		p1.setProduct_type("non-food");
		p1.setC(c);

		Products p2 = new Products();
		p2.setProduct_no(112);
		p2.setProduct_name("dettol");
		p2.setProduct_type("non-food");
		p2.setC(c);
		
		Products p3 = new Products();
		p3.setProduct_no(113);
		p3.setProduct_name("dettol");
		p3.setProduct_type("non-food");
		p3.setC(c);


		
		List<Products> p=new ArrayList<Products>();
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		
		
		ss.persist(c1);
		ss.persist(c2);
		ss.persist(c3);
		
		ss.persist(c);
		
		ss.persist(p1);
		ss.persist(p2);
		ss.persist(p3);
		
		ss.persist(p);
		
		
		tr.commit();
		ss.close();
		
		}
}
