package org.example.d9_3;

class Person{
	String name;
	int age;
	static int personcount=100;
	
	public Person() {
		this("-",0);
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void showRecords(){
		System.out.println("name 	: " + this.name);
		System.out.println("age 	: " + this.age);
		
	}
}

class Employee extends Person {
	int empid;
	float salary;
	static int employeecount=200;
	
	public Employee() {
		this(0,  0.0f);
	}
	
	public Employee(int empid, float salary) {
		this.empid=empid;
		this.salary=salary;
	}
	
	public Employee(String name, int age, int empid, float salary) {
		super(name,age);
//		this.name=name;
//		this.age=age;
		this.empid=empid;
		this.salary=salary;
	}
	
	public void displayRecords(){
		System.out.println("empid	: " + this.empid);
		System.out.println("salary	: " + this.salary);
	}
}

public class Program {

	public static void main(String[] args) {
		Person p = new Person("abhay",22); 
		Employee emp = new Employee("ab", 22, 003, 100000.0f);
		
//		p.showRecords();
//		emp.showRecords();
//		p.displayRecords();
//		emp.displayRecords();
		
//		emp.showRecords();
//		emp.displayRecords();
		
		System.out.println("person count	: " + Person.personcount);
//		System.out.println("employee count	: " + Person.employeecount);
		
		System.out.println("person count	: " + Employee.personcount);
		System.out.println("employee count	: " + Employee.employeecount);		
	}

}
