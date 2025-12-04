package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VoterData")
public class VoterId {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String Address;
	int age;
	String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public VoterId(int id, String name, String address, int age, String gender) {

		id = id;
		this.name = name;
		Address = address;
		this.age = age;
		this.gender = gender;
	}

	public VoterId() {

	}

	@Override
	public String toString() {
		return "VoterId [Id=" + id + ", name=" + name + ", Address=" + Address + ", age=" + age + ", gender=" + gender
				+ "]";
	}

}
