package com.li.pattern.simplefactory.impl;

import com.li.pattern.simplefactory.api.Car;

public class BMW implements Car {

	@Override
	public void drive() {
		System.out.println("I'm BMW M6,I don't afraid!");

	}

}
