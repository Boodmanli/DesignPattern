package com.li.pattern.simplefactory.impl;

import com.li.pattern.simplefactory.api.PaymentService;

public class ProxyFundServiceImpl implements PaymentService {

	@Override
	public void payment() {
		System.out.println("i'm proxy!");

	}

}
