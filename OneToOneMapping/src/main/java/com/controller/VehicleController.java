package com.controller;

import com.oto_entities.Customer;
import com.oto_entities.ShowRoom;
import com.oto_entities.Vehicle;
import com.service.VehicleService;

public class VehicleController {
	public static void main(String[] args) {

		ShowRoom sr = new ShowRoom();
		sr.setBranchNumber(123);
		sr.setShowRoomAdd("goa");
		sr.setShowRoomName("Patil Motors");

		Vehicle v = new Vehicle();
		v.setSr(sr);
		v.setVehicleName("Defender");
		v.setVehicleColor("Black-Red");
		v.setVehicleNumber(113);

		Customer c = new Customer();
		c.setCustomer_Mo_Number(1234567890);
		c.setCustomerName("Shubham");
		c.setV(v);

		VehicleService vs = new VehicleService();

		vs.servise(sr, v, c);
	}
}
