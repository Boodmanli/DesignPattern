package com.li.pattern.simplefactory.entity;

import com.li.pattern.simplefactory.Business;

public class PaymentDTO {
	
	private Business businessType;

	public Business getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Business businessType) {
		this.businessType = businessType;
	}

}
