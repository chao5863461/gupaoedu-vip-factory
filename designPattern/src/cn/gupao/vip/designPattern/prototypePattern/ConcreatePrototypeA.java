package cn.gupao.vip.designPattern.prototypePattern;

import java.util.List;

public class ConcreatePrototypeA implements Prototype {

	private int age;
	
	private String name;
	
	private List getHobbies;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List getGetHobbies() {
		return getHobbies;
	}


	public void setGetHobbies(List getHobbies) {
		this.getHobbies = getHobbies;
	}


	@Override
	public Prototype clone() {
		Prototype prototype = new ConcreatePrototypeA(); 
		prototype.setAge(age);
		return prototype;
	}

}
