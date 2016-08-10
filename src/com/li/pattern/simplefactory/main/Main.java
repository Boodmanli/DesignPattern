package com.li.pattern.simplefactory.main;

import com.li.pattern.simplefactory.Driver;
import com.li.pattern.simplefactory.api.Car;

public class Main {
	public static void main(String[] args) {
		Driver driver = new Driver();
		try {
			Car car =driver.driverCar("BMW");
			car.drive();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
