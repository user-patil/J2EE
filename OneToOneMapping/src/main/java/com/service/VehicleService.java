package com.service;

import com.dao.VehicleDao;
import com.oto_entities.Customer;
import com.oto_entities.ShowRoom;
import com.oto_entities.Vehicle;

public class VehicleService {
	public void servise(ShowRoom sr,Vehicle v,Customer c) {
		VehicleDao vd = new VehicleDao();
		vd.dao(sr , v, c);
	}
}
