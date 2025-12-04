package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int c_Id;
	String c_Name;
	String c_phoneNumber;

	@ManyToMany
	List<Products> p;

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public String getC_phoneNumber() {
		return c_phoneNumber;
	}

	public void setC_phoneNumber(String c_phoneNumber) {
		this.c_phoneNumber = c_phoneNumber;
	}

	public List<Products> getP() {
		return p;
	}

	public void setP(List<Products> p) {
		this.p = p;
	}

	public Customers(int c_Id, String c_Name, String c_phoneNumber, List<Products> p) {
		super();
		this.c_Id = c_Id;
		this.c_Name = c_Name;
		this.c_phoneNumber = c_phoneNumber;
		this.p = p;
	}

	public Customers() {

	}

	@Override
	public String toString() {
		return "Customers [c_Id=" + c_Id + ", c_Name=" + c_Name + ", c_phoneNumber=" + c_phoneNumber + ", p=" + p + "]";
	}

}
