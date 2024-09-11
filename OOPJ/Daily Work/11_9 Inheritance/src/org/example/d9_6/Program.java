package org.example.d9_6;

class Person{
	class Date{
		
		public void display() {
			System.out.println("inside nested class");
		}
		
	}
}

class Employee extends Person{
	
}

public class Program {

	public static void main(String[] args) {
		Person.Date pd = new Person().new Date();
		pd.display();
		
		
		Employee.Date ed = new Employee().new Date();
		ed.display();
	}

}
