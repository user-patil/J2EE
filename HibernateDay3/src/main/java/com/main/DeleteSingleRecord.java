package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entities.VoterId;

public class DeleteSingleRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(VoterId.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;
		String hqlQuery = "delete from VoterId where id =:id";
		Query query = ss.createQuery(hqlQuery);
		query.setParameter("id", id);
		int rows = query.executeUpdate();
		System.out.println(rows);

		tr.commit();
		ss.close();
	}
}
