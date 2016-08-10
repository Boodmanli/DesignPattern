package com.li.pattern.simplefactory.impl;

import com.li.pattern.simplefactory.api.PaymentService;

public class DirectFundServiceImpl implements PaymentService {

	@Override
	public void payment() {
		System.out.println("im direct!");

	}

}
