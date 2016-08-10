package com.li.pattern.simplefactory;

import com.li.pattern.simplefactory.api.PaymentService;
import com.li.pattern.simplefactory.entity.PaymentDTO;

public class TestBusiness {

	public PaymentService paymentFactory(PaymentDTO paymentDTO) throws InstantiationException, IllegalAccessException{
		Class class1=null;
		Object object =null;
		try {
			System.out.println("com.li.pattern.simplefactory.impl."+paymentDTO.getBusinessType().getService());
			class1 = Class.forName("com.li.pattern.simplefactory.impl."+paymentDTO.getBusinessType().getService());
			object = class1.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PaymentService paymentService = (PaymentService) object;
		
		return paymentService;

	}


}
