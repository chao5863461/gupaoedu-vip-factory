package cn.gupao.vip.designPattern.singletonPattern;

public class HungerSingleton {
	
	//使用final，变量不能更改，防止反射破坏单利
	private static final HungerSingleton hungerSingleton = new HungerSingleton();
	
	//静态构造方法
	private HungerSingleton() {}
	
	//对外访问的方法
	public static HungerSingleton getInstance() {
		return hungerSingleton;
	}
}
