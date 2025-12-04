package com.oneToOneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cab {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int CabNumber;
	String modelName;
	String CabColor;
	
	public int getCabNumber() {
		return CabNumber;
	}
	public void setCabNumber(int cabNumber) {
		CabNumber = cabNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCabColor() {
		return CabColor;
	}
	public void setCabColor(String cabColor) {
		CabColor = cabColor;
	}
	public Cab(int cabNumber, String modelName, String cabColor) {
		super();
		CabNumber = cabNumber;
		this.modelName = modelName;
		CabColor = cabColor;
	}
	@Override
	public String toString() {
		return "Cab [CabNumber=" + CabNumber + ", modelName=" + modelName + ", CabColor=" + CabColor + "]";
	}
	public Cab() {
		
	}

	
}
