package cn.gupao.vip.designPattern.singletonPattern;

public class LazySingleton {

	
	private static LazySingleton lazySingleton ;
	//私有构造
	private LazySingleton() {}
	
	//实例化的方法
	public static synchronized LazySingleton getInstance() {
		//只实例化一次
		if(lazySingleton==null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}
