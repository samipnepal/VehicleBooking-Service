package com.anedia.vehicle.service;

import java.util.ArrayList;

import com.anedia.vehicle.bean.VehicleBean;

public interface Cutomer {
	
	ArrayList<VehicleBean> viewVehiclesByType(String vehicleType);

}
