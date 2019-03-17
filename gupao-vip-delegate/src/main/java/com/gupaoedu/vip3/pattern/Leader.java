package com.gupaoedu.vip3.pattern;

import java.util.HashMap;
import java.util.Map;

import javax.imageio.spi.RegisterableService;

public class Leader {

	//预先知道员工的特产，，易于分配任务
	private final static Map<String,IEmployee> regist= new HashMap<String,IEmployee>();
	static {
		regist.put("开发", new EmployeeA());
		regist.put("测试", new EmployeeB());
		regist.put("安全", new EmployeeC());
	}
	//根据Boss下发的指令，调度员工
	public void doing(String command) {
		regist.get(command).doing(command);
	}
	
}
