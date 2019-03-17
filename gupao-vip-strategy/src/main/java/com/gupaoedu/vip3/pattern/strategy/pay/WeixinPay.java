package com.gupaoedu.vip3.pattern.strategy.pay;

public class WeixinPay extends Payment {

	@Override
	public String getName() {
		return "微信";
	}

	@Override
	public double queryAmount(String uid) {
		return 800;
	}

}
