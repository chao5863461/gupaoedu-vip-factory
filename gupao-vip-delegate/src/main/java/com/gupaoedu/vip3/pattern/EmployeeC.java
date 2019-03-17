package com.gupaoedu.vip3.pattern;

public class EmployeeC implements IEmployee {

	@Override
	public void doing(String command) {
		System.out.println("我是员工C,属于安全部,开始干活 " +command);
	}

}
