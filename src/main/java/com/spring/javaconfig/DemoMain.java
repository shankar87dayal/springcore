package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/spring/javaconfig/config.xml");
		
		Student student = context.getBean("firststudent",Student.class);
		System.out.println(student);
	}
}
