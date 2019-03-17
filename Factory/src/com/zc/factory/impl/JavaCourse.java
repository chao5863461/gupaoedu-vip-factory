package com.zc.factory.impl;

import com.zc.factory.ICourse;

public class JavaCourse implements ICourse {

	@Override
	public void record() {
		System.out.println("JAVA Course");
	}

}
