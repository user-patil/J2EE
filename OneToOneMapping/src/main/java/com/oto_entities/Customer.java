package com.oto_entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int CustomerID;
	String CustomerName;
	long Customer_Mo_Number;
	@OneToOne
	Vehicle v;

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public long getCustomer_Mo_Number() {
		return Customer_Mo_Number;
	}

	public void setCustomer_Mo_Number(long customer_Mo_Number) {
		Customer_Mo_Number = customer_Mo_Number;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public Customer(int customerID, String customerName, long customer_Mo_Number, Vehicle v) {
		super();
		CustomerID = customerID;
		CustomerName = customerName;
		Customer_Mo_Number = customer_Mo_Number;
		this.v = v;
	}

	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", Customer_Mo_Number="
				+ Customer_Mo_Number + ", v=" + v + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
