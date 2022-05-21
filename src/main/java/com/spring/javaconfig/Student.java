package com.spring.javaconfig;


public class Student {
	
	private Samosa samosa;  //injecting constructor injection
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study()
	{
		this.samosa.display();
		System.out.println("student reading the book");
	}

}
