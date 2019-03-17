package com.gupaoedu.vip3.pattern.strategy;

public class PromotionTest {

	public static void main(String[] args) {

//		PromotionActivity activity618 = new PromotionActivity(new CoupnStrategy());
//
//		PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());
//		activity1111.execute();
//		activity618.execute();
		
		String promotionKey="cash";
		
		PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
		activity.execute();
	}

}
