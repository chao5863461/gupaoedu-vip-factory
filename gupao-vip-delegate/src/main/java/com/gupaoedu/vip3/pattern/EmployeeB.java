package com.gupaoedu.vip3.pattern;

public class EmployeeB implements IEmployee {

	@Override
	public void doing(String command) {
		System.out.println("我是员工B,属于测试部,开始干活 " +command);
	}

}
