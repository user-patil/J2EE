package com.pojo;

public class College {

	int collage_id;
	String collage_name;
	String city;
	
	Students stud;

	public int getCollage_id() {
		return collage_id;
	}

	public void setCollage_id(int collage_id) {
		this.collage_id = collage_id;
	}

	public String getCollage_name() {
		return collage_name;
	}

	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Students getStud() {
		return stud;
	}

	public void setStud(Students stud) {
		this.stud = stud;
	}

	public College(int collage_id, String collage_name, String city, Students stud) {
		super();
		this.collage_id = collage_id;
		this.collage_name = collage_name;
		this.city = city;
		this.stud = stud;
	}

	public College() {

	}

	@Override
	public String toString() {
		return "College [collage_id=" + collage_id + ", collage_name=" + collage_name + ", city=" + city + ", std="
				+ stud + "]";
	}

}
