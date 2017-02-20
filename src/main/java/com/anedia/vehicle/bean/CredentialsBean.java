package com.anedia.vehicle.bean;

/**
 * This class has the information about user for login.
 */
public class CredentialsBean {
	
	private String userID;
	private String password;
	private String userType;
	private int loginStatus;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	public CredentialsBean(String userID, String password, String userType, int loginStatus) {
		super();
		this.userID = userID;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
	}
	
	public CredentialsBean() {
		// TODO Auto-generated constructor stub
	}

}
