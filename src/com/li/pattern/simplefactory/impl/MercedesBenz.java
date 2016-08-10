package com.li.pattern.simplefactory.impl;

import com.li.pattern.simplefactory.api.Car;

public class MercedesBenz implements Car {

	@Override
	public void drive() {
		System.out.println("I'm AMG S 65 L,are you afraid!");

	}

}
