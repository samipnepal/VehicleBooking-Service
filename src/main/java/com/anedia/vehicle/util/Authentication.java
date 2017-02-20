package com.anedia.vehicle.util;

import com.anedia.vehicle.bean.CredentialsBean;

public interface Authentication {
	
	boolean authenticate(CredentialsBean credentialsBean);
	String authorize(String userID);
	boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus);

}
