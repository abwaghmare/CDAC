package org.example.d9_demo1;

class Person{
	private String name;
	private int age;
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}

class Employee extends Person{
	
}

public class Program {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.setName("abhay");
		System.out.println("name : " + p.getName());
		
		Employee emp = new Employee();
		
		emp.setAge(22);
		System.out.println("age : " + emp.getAge());
		
	}

}
