package com.gupaoedu.vip3.pattern.strategy.pay;

public class Order {

	private String uid;
	private String orderId;
	private double amount;
	
	public Order(String uid, String orderId, double amount) {
		super();
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public void pay() {
		pay(PayStrategy.DEFAUlT_PAY);
	}
	
	public PayState pay(String payKey) {
		Payment payment = PayStrategy.get(payKey);
		System.out.println("欢迎使用"+payment.getName());
		System.out.println("本次交易金额为"+amount+"开始交易...");
		return payment.pay(uid, amount);
	}
}
