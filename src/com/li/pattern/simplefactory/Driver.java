package com.li.pattern.simplefactory;

import com.li.pattern.simplefactory.api.Car;
import com.li.pattern.simplefactory.impl.BMW;
import com.li.pattern.simplefactory.impl.MercedesBenz;

public class Driver {
	public static Car driverCar(String string) throws Exception{
		if (string.equalsIgnoreCase("MercedesBenz")) {
			return new MercedesBenz();
		}else if (string.equalsIgnoreCase("BMW")) {
			return new BMW();
		}else {
			throw new Exception();
		}
	} 

}
