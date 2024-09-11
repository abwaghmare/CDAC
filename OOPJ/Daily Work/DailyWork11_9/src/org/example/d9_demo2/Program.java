package org.example.d9_demo2;

class A{
	int num1=10;
	int num3=20;
}

class B  extends A{
	int num2=30;
	int num3=40;
	
	public void f1() {
		System.out.println("num1 : " + this.num1);
//		System.out.println("num3 : " + this.num3); //40
		System.out.println("num3 : " + super.num3); //20
		
		System.out.println("num2 : " + this.num2);
		System.out.println("num3 : " + this.num3);
	}
}


public class Program {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.f1();

	}

}
