package cn.gupao.vip.designPattern.singletonPattern;

public class HungerStaticSingleton {

	//私有变量，实例化在静态块中
	private static final HungerStaticSingleton hungerStaticSingleton;
	
	static {
		hungerStaticSingleton = new HungerStaticSingleton();
	}
	//私有构造
	private HungerStaticSingleton() {}
	
	//公有对外访问方法
	public static HungerStaticSingleton newInstance() {
		
		
		return hungerStaticSingleton;
	}
}
