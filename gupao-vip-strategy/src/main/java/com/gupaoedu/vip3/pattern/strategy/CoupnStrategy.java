package com.gupaoedu.vip3.pattern.strategy;

public class CoupnStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("满20人，全团享最优价格");
	}

}
