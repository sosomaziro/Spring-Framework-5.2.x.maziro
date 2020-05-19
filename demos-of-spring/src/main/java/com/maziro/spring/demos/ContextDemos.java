package com.maziro.spring.demos;

import com.maziro.spring.beans.UserDemo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextDemos {
	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:bean-context-demo.xml");
		UserDemo userDemo = (UserDemo) beanFactory.getBean("userDemo");
		userDemo.setUserName("so");
		userDemo.setAge(18);
		userDemo.setAccount("123");
		System.out.println(userDemo.getUserInfo());

	}
}
