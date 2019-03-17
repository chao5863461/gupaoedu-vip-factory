package com.zc.factory;

public class SimpleFactory {

	
	public static ICourse createCourse(Class clazz) {
		ICourse course= null;
		if(null!=clazz) {
			try {
				 course = (ICourse) clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
		return course;
	}
}
