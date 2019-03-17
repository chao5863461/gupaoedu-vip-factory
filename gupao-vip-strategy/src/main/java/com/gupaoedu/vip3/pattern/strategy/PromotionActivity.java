package com.gupaoedu.vip3.pattern.strategy;

public class PromotionActivity {

	PromotionStrategy promotionStrategy;

	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}


	public void execute() {
		promotionStrategy.doPromotion();
	}
}
