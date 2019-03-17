package com.gupaoedu.vip3.pattern.strategy;

public class CashbackStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("领取优惠卷，扣减课程价格");
	}

}
