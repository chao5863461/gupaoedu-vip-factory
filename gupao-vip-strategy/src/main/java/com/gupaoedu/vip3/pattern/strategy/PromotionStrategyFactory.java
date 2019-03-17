package com.gupaoedu.vip3.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

	//实现一种选择优惠的方式的算法策略
	private PromotionStrategyFactory() {}
	
	public static PromotionStrategy getPromotionStrategy(String key) {
		
		PromotionStrategy strategy = PromotionStaticStrategy.strategyMap.get(key);
		return strategy==null?PromotionStaticStrategy.EMPTY:strategy;
	}
	
	private static class PromotionStaticStrategy{
		private final static PromotionStrategy EMPTY = new EmptyStrategy();
		private final static Map<String,PromotionStrategy> strategyMap = new HashMap<String,PromotionStrategy>();
		static {
			strategyMap.put(PromotionEnum.CASH.getActivity(), new CashbackStrategy());
			strategyMap.put(PromotionEnum.COUPN.getActivity(), new CoupnStrategy());
			strategyMap.put(PromotionEnum.GROUP.getActivity(), new GroupStrategy());
		}
	} 
}
