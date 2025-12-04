package com.oto_entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	int vehicleNumber;
	String vehicleName;
	String vehicleColor;
	@OneToOne
	ShowRoom sr;

	

	public ShowRoom getSr() {
		return sr;
	}

	public void setSr(ShowRoom sr) {
		this.sr = sr;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public Vehicle(int vehicleNumber, String vehicleName, String vehicleColor, ShowRoom sr) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleColor = vehicleColor;
		this.sr = sr;
	}
	

	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName + ", vehicleColor="
				+ vehicleColor + ", sr=" + sr + "]";
	}

	public Vehicle() {

	}

}
