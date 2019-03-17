package com.gupaoedu.vip3.pattern.strategy;

public enum PromotionEnum {

	CASH("cash"),
	GROUP("group"),
	COUPN("coupn"),
	EMPTY("empty");

	
	private String activity;

	private PromotionEnum(String activity) {
		this.activity = activity;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
}
