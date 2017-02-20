package com.anedia.vehicle.dao;

import java.util.ArrayList;

import com.anedia.vehicle.bean.DriverBean;

public interface DriverDAO {
	String createDriver(DriverBean driverBean);
	int delteDriver(ArrayList<String> deleteDriver);
	boolean updateDriver(DriverBean driverBean);
	DriverBean findByID(String driverID);
	ArrayList<DriverBean> findAll();

}
