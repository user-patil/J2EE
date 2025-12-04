package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Department;
import com.entities.Employee;

public class MyMain {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		
		Department dept = new Department();
		dept.setDeptName("java developer");

		

		Employee emp1 = new Employee();
		emp1.setEmpId(110);
		emp1.setEmpName("kbl");
		emp1.setSalary("111");
		emp1.setDept(dept);

		Employee emp2 = new Employee();
		emp2.setEmpId(111);
		emp2.setEmpName("p");
		emp2.setSalary("45");
		emp2.setDept(dept);

		Employee emp3 = new Employee();
		emp3.setEmpId(112);
		emp3.setEmpName("r");
		emp3.setSalary("7");
		emp3.setDept(dept);
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		dept.setEmp(list);
		
		ss.persist(emp1);
		ss.persist(emp2);
		ss.persist(emp3);
		ss.persist(dept);
		
		tr.commit();
		ss.close();
	}
}
