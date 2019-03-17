package com.zc.factory.FactoryMethod;

import com.zc.factory.ICourse;

public class FactoryMethodTest {

	public static void main(String[] args) {
		ICourseFactory factory = new JavaCourseFactory();
		ICourse course = factory.record();
		 course.record();
	}
}
