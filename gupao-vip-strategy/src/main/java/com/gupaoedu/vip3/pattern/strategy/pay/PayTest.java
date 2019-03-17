package com.gupaoedu.vip3.pattern.strategy.pay;

public class PayTest {

	public static void main(String[] args) {
		Order order =new Order("1", "52444122223", 3500);
		System.out.println(order.pay("alipay"));
		
	}
}
