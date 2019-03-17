package com.zc.factory.FactoryMethod;

import com.zc.factory.ICourse;
import com.zc.factory.impl.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

	@Override
	public ICourse record() {
		return new JavaCourse();
	}

}
