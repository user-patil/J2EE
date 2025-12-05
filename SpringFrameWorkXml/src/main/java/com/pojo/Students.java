package com.pojo;

public class Students {

	int stud_id;
	String stud_Name;
	String city;

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_Name() {
		return stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Students(int stud_id, String stud_Name, String city) {
		super();
		this.stud_id = stud_id;
		this.stud_Name = stud_Name;
		this.city = city;
	}

	public Students() {

	}

	@Override
	public String toString() {
		return "Students [stud_id=" + stud_id + ", stud_Name=" + stud_Name + ", city=" + city + "]";
	}

}
