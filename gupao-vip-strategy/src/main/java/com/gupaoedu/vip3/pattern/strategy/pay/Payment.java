package com.gupaoedu.vip3.pattern.strategy.pay;

public abstract class Payment {

	public abstract String getName();
	
	public abstract double queryAmount(String uid);
	
	public PayState pay(String uid,double amount) {
		double accountAmount = queryAmount(uid);
		if(accountAmount<amount) {
			//账户余额不足,支付失败
			return new PayState(500,"支付失败","账户余额不足");
		}else {
			return new PayState(200,"支付成功","支付金额:"+amount+",账户剩余:"+(accountAmount-amount));
		}
	}
	
}
