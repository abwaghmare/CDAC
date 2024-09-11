package org.example.d9_2;

class Employee{
	String name;
	int age;
	int empid;
	float salary;
	
	public Employee() {
		this.name="-";
		this.age=0;
		this.empid=0;
		this.salary=0.0f;
	}
	
	public Employee(String name, int age, int empid, float salary) {
		this.name=name;
		this.age=age;
		this.empid=empid;
		this.salary=salary;
	}
	
	public void displayRecord() {
		System.out.println("name	:	" + this.name);
		System.out.println("age	:	" + this.age);
		System.out.println("empid	:	" + this.empid);
		System.out.println("salary	:	" + this.salary);
	}
	
}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee("abhay",22,001,80000);
		
		emp.displayRecord();
	}

}
