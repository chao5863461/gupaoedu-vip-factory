package cn.gupao.vip.designPattern.singletonPattern;

public class LazyDubboCheckSingleton {

	private static LazyDubboCheckSingleton lazyDubboCheckSingleton = null;
	
	private LazyDubboCheckSingleton() {}
	
	public static LazyDubboCheckSingleton getInstance() {
		
		//解决线程同步时，其他线程都需要等待，如果已经有线程创建了，则其他线程不需要进行等待执行
		if(null==lazyDubboCheckSingleton) {
			synchronized (LazyDubboCheckSingleton.class) {
				//多个线程并发时，只创建一次，其他的有则直接返回
				if(null==lazyDubboCheckSingleton) {
					lazyDubboCheckSingleton = new LazyDubboCheckSingleton();
				}
			}
		}
		return lazyDubboCheckSingleton;
	}
	
}
