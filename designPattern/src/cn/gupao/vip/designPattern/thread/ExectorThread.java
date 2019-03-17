package cn.gupao.vip.designPattern.thread;

import cn.gupao.vip.designPattern.singletonPattern.LazyDubboCheckSingleton;
import cn.gupao.vip.designPattern.singletonPattern.LazySingleton;

public class ExectorThread implements Runnable{

	@Override
	public void run() {
		LazySingleton lazySingleton = LazySingleton.getInstance();
		System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
		
		LazyDubboCheckSingleton lazyDubboCheckSingleton = LazyDubboCheckSingleton.getInstance();
		System.out.println(Thread.currentThread().getName()+":"+lazyDubboCheckSingleton);
	}

}
