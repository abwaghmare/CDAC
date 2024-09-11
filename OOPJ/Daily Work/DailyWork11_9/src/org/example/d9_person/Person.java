package org.example.d9_person;

public class Person {
	private String name;
	private int age;
	
	public Person(){
		this.name="-";
		this.age=0;
	}
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void printRecord() {
		System.out.println("name : " + this.name);
		System.out.println("age : " + this.age);
	}

}
