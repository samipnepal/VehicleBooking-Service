package com.anedia.vehicle.util;

public interface Payment {
	
	boolean findByCardNumber(String userID, String cardNumber);
	String process(Payment payment);
}
