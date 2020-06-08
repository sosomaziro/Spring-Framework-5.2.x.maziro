package com.maziro.spring.demos;

import com.maziro.spring.beans.UserDemo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class ContextDemos {
	public static void main(String[] args) {
		// xml
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:bean-context-demo.xml");
//		UserDemo userDemo = (UserDemo) beanFactory.getBean("userDemo");
//		setUserDemo(userDemo);

		// Spring上下文环境
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(UserDemo.class);
		context.refresh();
		UserDemo bean = context.getBean(UserDemo.class);
		setUserDemo(bean);
	}

	private static void setUserDemo(UserDemo userDemo) {
		userDemo.setUserName("so");
		userDemo.setAge(18);
		userDemo.setAccount("123");
		System.out.println(userDemo.getUserInfo());
	}
}
