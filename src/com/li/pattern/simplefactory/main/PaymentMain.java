package com.li.pattern.simplefactory.main;

import com.li.pattern.simplefactory.Business;
import com.li.pattern.simplefactory.TestBusiness;
import com.li.pattern.simplefactory.api.PaymentService;
import com.li.pattern.simplefactory.entity.PaymentDTO;
import com.li.pattern.simplefactory.impl.DirectFundServiceImpl;

public class PaymentMain {

	public static void main(String[] args) {
		System.out.println(DirectFundServiceImpl.class.getName());
		PaymentDTO paymentDTO = new PaymentDTO();
		
		TestBusiness testBusiness = new TestBusiness();

		paymentDTO.setBusinessType(Business.DIRECTFUNDSERVICE);
		try {
			PaymentService paymentService =testBusiness.paymentFactory(paymentDTO);
			paymentService.payment();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
