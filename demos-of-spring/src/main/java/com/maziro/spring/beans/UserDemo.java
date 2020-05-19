package com.maziro.spring.beans;

public class UserDemo {

	private String userName;
	private String account;
	private Integer age;

	public UserDemo() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUserInfo() {
		return userName + ", " + account + ", " + age;
	}
}
