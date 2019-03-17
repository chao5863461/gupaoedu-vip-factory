package com.gupaoedu.vip3.pattern;

public class EmployeeA implements IEmployee {

	@Override
	public void doing(String command) {
		System.out.println("我是员工A,属于开发部,开始干活 " +command);
	}

}
