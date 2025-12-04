package com.oneToOneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class NewDriver {
	@Id
	int DriverID;
	String DriverName;
	String Gender;

	@OneToOne
	Cab c;

	public int getDriverID() {
		return DriverID;
	}

	public void setDriverID(int driverID) {
		DriverID = driverID;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Cab getC() {
		return c;
	}

	public void setC(Cab c) {
		this.c = c;
	}

	public NewDriver(int driverID, String driverName, String gender, Cab c) {
		super();
		DriverID = driverID;
		DriverName = driverName;
		Gender = gender;
		this.c = c;
	}

	@Override
	public String toString() {
		return "NewDriver [DriverID=" + DriverID + ", DriverName=" + DriverName + ", Gender=" + Gender + ", c=" + c
				+ "]";
	}

	public NewDriver() {

	}

}
