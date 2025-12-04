package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Products {
	@Id
	int product_no;
	String Product_name;
	String product_type;

	@ManyToMany
	List<Customers> c;

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public List<Customers> getC() {
		return c;
	}

	public void setC(List<Customers> c) {
		this.c = c;
	}

	public Products(int product_no, String product_name, String product_type, List<Customers> c) {
		super();
		this.product_no = product_no;
		Product_name = product_name;
		this.product_type = product_type;
		this.c = c;
	}

	public Products() {

	}

	@Override
	public String toString() {
		return "Products [product_no=" + product_no + ", Product_name=" + Product_name + ", product_type="
				+ product_type + ", c=" + c + "]";
	}

}
