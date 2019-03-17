package com.gupaoedu.vip3.pattern.strategy.pay;

public class AliPay extends Payment {

	@Override
	public String getName() {
		return "支付宝";
	}

	@Override
	public double queryAmount(String uid) {
		return 1000;
	}

}
