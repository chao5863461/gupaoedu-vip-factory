package com.gupaoedu.vip3.pattern.strategy.pay;

public class UnionPay extends Payment {

	@Override
	public String getName() {
		return "银联支付";
	}

	@Override
	public double queryAmount(String uid) {
		return 1200;
	}

}
