package com.anedia.vehicle.dao;

import java.util.ArrayList;

import com.anedia.vehicle.bean.VehicleBean;

public interface VehicleDAO {
	String createVehicle(VehicleBean vehicleBean);
	int delteVehicle(ArrayList<String> deleteVehicle);
	boolean updateVehicle(VehicleBean vehicleBean);
	VehicleBean findByID(String vehicleID);
	ArrayList<VehicleBean> findAll();

}
