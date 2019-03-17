package com.gupaoedu.vip3.pattern.strategy;

public class GroupStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("组团满20人购买课程，每人都可以享受最优价格");
	}

}
