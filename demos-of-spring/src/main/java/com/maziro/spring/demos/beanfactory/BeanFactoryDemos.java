package com.maziro.spring.demos.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryDemos {

	public static void main(String[] args) {
		beanFactory();
	}


	private static void beanFactory() {
		ClassPathResource resource = new ClassPathResource("bean-context-demo.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		System.out.println(reader);
	}
}
