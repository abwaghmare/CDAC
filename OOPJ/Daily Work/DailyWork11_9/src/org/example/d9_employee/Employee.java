package org.example.d9_employee;

import org.example.d9_person.Person;

public class Employee extends Person{
	private int empid;
	private float salary;
	
	
	public Employee(String name, int age, int empid, float salary) {
		super(name, age);
		this.empid=empid;
		this.salary=salary;
	}
	
	@Override
	public void printRecord() {
		super.printRecord();
		System.out.println("empid : " + this.empid);
		System.out.println("salary : " + this.salary);
	}
	

}
