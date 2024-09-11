package org.example.d9_1;

class Person{
	String name;
	int age;
	
	public Person(){
		this("", 0);
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void showRecord() {
		System.out.println("name	:	"+this.name);
		System.out.println("age	:	"+this.age);
	}
}


public class Program {

	public static void main(String[] args) {	
		Person p = new Person("abhay", 22);
		
		p.showRecord();
	}

}
