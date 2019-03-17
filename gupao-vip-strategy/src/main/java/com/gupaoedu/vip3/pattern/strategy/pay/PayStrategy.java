package com.gupaoedu.vip3.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

	private static Map<String,Payment> payStrategyMap = new HashMap<String,Payment>();
	
	public final static String ALI_PAY="alipay";
	public final static String JD_PAY = "jdpay";
	public final static String WEIXIN_PAY="winxinpay";
	public final static String UNION_PAY = "unionpay";
	public final static String DEFAUlT_PAY = "default_pay";

	
	static {
		payStrategyMap.put(ALI_PAY, new AliPay());
		payStrategyMap.put(JD_PAY, new JDPay());
		payStrategyMap.put(WEIXIN_PAY, new WeixinPay());
		payStrategyMap.put(UNION_PAY, new UnionPay());
	}
	
	public static Payment get(String payKey) {
		if(payStrategyMap.containsKey(payKey)){
			return payStrategyMap.get(payKey);
		}else {
			return payStrategyMap.get(DEFAUlT_PAY);
		}
	} 
}
