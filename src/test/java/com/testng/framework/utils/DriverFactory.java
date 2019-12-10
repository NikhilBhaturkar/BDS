package com.testng.framework.utils;

public class DriverFactory {
	
	public static DriverClass createInstance() {
		DriverClass driver = new DriverClass();
		return driver.createDriver();		
	}

}
