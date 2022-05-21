package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring.javaconfig") //when use bean annotation then we want to remove this line.
public class JavaConfig {
	
	@Bean
	public Samosa getsamosa()
	{
		return new Samosa();
	}
	
	@Bean(name = {"temp" , "stu" , "con"})
	public Student getStudent() 
	{
//		creating a new student object
		Student student =new Student(getsamosa());
		return student;
	}

}
