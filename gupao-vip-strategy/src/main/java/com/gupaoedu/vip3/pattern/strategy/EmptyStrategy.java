package com.gupaoedu.vip3.pattern.strategy;

public class EmptyStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("无优惠活动");
	}

}
