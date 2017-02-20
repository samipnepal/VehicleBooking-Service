package com.anedia.vehicle.dao;

import java.util.ArrayList;
import com.anedia.vehicle.bean.ReservationBean;

public interface ReservationDAO {
	
	String createReservation(ReservationBean reservationBean);
	int delteReservation(ArrayList<String> deleteReservation);
	boolean updateReservation(ReservationBean reservationBean);
	ReservationBean findByID(String reservationID);
	ArrayList<ReservationBean> findAll();
}
