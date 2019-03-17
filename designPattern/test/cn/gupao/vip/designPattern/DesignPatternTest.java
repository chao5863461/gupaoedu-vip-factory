package cn.gupao.vip.designPattern;

import cn.gupao.vip.designPattern.thread.ExectorThread;

public class DesignPatternTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ExectorThread());
		Thread t2 = new Thread(new ExectorThread());

		t1.start();
		t2.start();
	}

}
