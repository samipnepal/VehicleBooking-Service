package com.anedia.vehicle.service;

import java.util.ArrayList;
import java.util.Date;

import com.anedia.vehicle.bean.DriverBean;
import com.anedia.vehicle.bean.ReservationBean;
import com.anedia.vehicle.bean.RouteBean;
import com.anedia.vehicle.bean.VehicleBean;

public interface Administrator {
	
	String addVehicle(VehicleBean vehicleBean);
	int deleteVehicle(ArrayList<String> vehicleID);
	VehicleBean viewVehicle(String vehicleID);
	boolean modifyVehicle(VehicleBean vehicleBean);
	String addDriver(DriverBean driverBean);
	int deleteDriver(ArrayList<String> driverID);
	boolean allotDriver(String reservationID, String driverID);
	boolean modifyDriver(DriverBean driverBean);
	String addRoute(RouteBean routeBean);
	int deleteRoute(ArrayList<String> routeID);
	RouteBean viewRoute(String routeID);
	boolean modifyRoute(RouteBean routeBean);
	ArrayList<ReservationBean> viewBookingDetails(Date journeyDate, String source, String destination);
	

}
