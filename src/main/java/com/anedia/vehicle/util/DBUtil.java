package com.anedia.vehicle.util;

import java.sql.Connection;

public interface DBUtil {
	
	Connection getDBConnection(String driverType);

}
