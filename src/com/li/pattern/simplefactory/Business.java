package com.li.pattern.simplefactory;

public enum Business {

	DIRECTFUNDSERVICE("DirectFundServiceImpl","1"),
	PROXYFUNDSERVICE("ProxyFundServiceImpl","2");
	
	
	
	private String service;
	private String businessCode;
	
	private Business(String service,String businessCode){
		this.service=service;
		this.businessCode=businessCode;
	}
	public String getServiceName(String businessCode){
		for (Business business : Business.values()) {
			if (business.getBusinessCode()==businessCode) {
				return business.service;
			}
		}
		return null;
	}
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	
}
