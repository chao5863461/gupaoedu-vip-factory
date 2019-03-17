package com.gupaoedu.vip3.pattern.strategy.pay;

public class JDPay extends Payment {

	@Override
	public String getName() {
		return "京东支付";
	}

	@Override
	public double queryAmount(String uid) {
		return 500;
	}

}
