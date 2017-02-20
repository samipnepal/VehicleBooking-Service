package com.anedia.vehicle.dao;

import java.util.ArrayList;

import com.anedia.vehicle.bean.ProfileBean;

public interface ProfileDAO {
	
	String createProfile(ProfileBean profileBean);
	int delteProfile(ArrayList<String> deleteProfile);
	boolean updateProfile(ProfileBean profileBean);
	ProfileBean findByID(String profileID);
	ArrayList<ProfileBean> findAll();
}
