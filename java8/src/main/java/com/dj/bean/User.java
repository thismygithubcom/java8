
package com.dj.bean;

public class User {
	/**
	 * 用户名
	 */
	private String name;
	/**
	 * 年龄1
	 */
	private int age;

	
	//获取用户名
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
