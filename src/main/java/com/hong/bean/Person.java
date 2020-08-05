package com.hong.bean;

public class Person {

	public Person() {}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;

	private Integer age;

	private String nickName;

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nickName=" + nickName + "]";
	}








}
