package com.zc.factory;

import com.zc.factory.impl.JavaCourse;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		ICourse course = SimpleFactory.createCourse(JavaCourse.class);
		course.record();
	}
}
