package com.main;
	import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

	public class DisplayData {
		public static void main(String[] args) {

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			Employee ee=ss.get(Employee.class, 101) ;
			if(ee!= null) {
				System.out.println(ee);
			}
			tr.commit();
			ss.close();
			
		}
	

}
