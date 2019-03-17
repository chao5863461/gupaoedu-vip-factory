package com.gupaoedu.vip3.pattern;

public class Boss {

	public void doing(String command) {
		new Leader().doing(command);
	}
	
}
