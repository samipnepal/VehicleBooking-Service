package com.anedia.vehicle.dao;

import java.util.ArrayList;

import com.anedia.vehicle.bean.RouteBean;

public interface RouteDAO {
	String createRoute(RouteBean routeBean);
	int delteRoute(ArrayList<String> deleteRoute);
	boolean updateRoute(RouteBean routeBean);
	RouteBean findByID(String routeID);
	ArrayList<RouteBean> findAll();

}
