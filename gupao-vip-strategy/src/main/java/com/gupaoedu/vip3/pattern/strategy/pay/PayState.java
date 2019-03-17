package com.gupaoedu.vip3.pattern.strategy.pay;

public class PayState {

	private int code;
	
	private String msg;
	
	private Object data;

	public PayState(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public String toString() {
		
		return "支付状态["+code+"],"+msg+",交易详情:"+data;
	}
}
