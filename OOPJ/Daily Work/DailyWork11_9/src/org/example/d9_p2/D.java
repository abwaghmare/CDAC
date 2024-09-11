package org.example.d9_p2;

import org.example.d9_p1.A;

public class D extends A{
	A a = new A();
	
	public void f4() {
//		System.out.println("n1 : " + this.n1);  //not visible
//		System.out.println("n2 : " + this.n2);	//not visible
		System.out.println("n3 : " + this.n3);
		System.out.println("n4 : " + this.n4);
	}
}
