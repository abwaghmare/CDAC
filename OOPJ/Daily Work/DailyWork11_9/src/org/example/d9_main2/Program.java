package org.example.d9_main2;

import org.example.d9_employee.Employee;
import org.example.d9_person.Person;

public class Program {

	public static void main(String[] args) {
		Person p = new Person("Abhay", 22);
		
//		p.printRecord();
		
		Employee emp = new Employee("Abhay", 22, 003, 100000.0f);
		
		emp.printRecord();
	}

}
