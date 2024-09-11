package org.example.d9_demo3;

class A{
	int num1=10;
	
	void display() {
		System.out.println("num1 : " + this.num1);
	}
	
	void show() {
		System.out.println("num1 : " + this.num1);
	}
	
}

class B extends A{
	int num2=20;
	
	void display() {
//		this.display(); // it will go in recursion
//		super.display();
		System.out.println("num1 : " + this.num2);
	}
	
	void print() {
//		this.display(); //it will check the method that is in same class
		super.display();
		System.out.println("num1 : " + this.num2);
	}
}

public class Program {

	public static void main(String[] args) {

		B b = new B();
		
		b.print();
		
	}

}
