package com.maziro.spring.demos.resource;

import org.springframework.core.io.*;

public class ResourceLoaderDemo {

	public static void main(String[] args) {
		resourceLoader();
	}

	/**
	 * DefaultResourceLoader 加载资源的具体策略
	 */
	private static void resourceLoader() {
		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource1f = new FileSystemResourceLoader().getResource("D:/Users/chenming673/Documents/spark.txt");
		System.out.println("fileResource1f is FileSystemResource:" + (fileResource1f instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("/Users/chenming673/Documents/spark.txt");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/Users/chenming673/Documents/spark.txt");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));
	}
}
