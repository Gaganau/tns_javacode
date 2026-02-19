package org.tnsif.acc.c2tc.java_basics;

import org.tnsif.acc.c2tc.oopsDemo.Variablesdemo;

public class Variablesdemo {
	int a = 10;
	void print() {
		String msg = "hello";
		System.out.println(msg);
	}
	static String message = "hello students";

	public static void main(String[] args) {
		Variablesdemo obj = new Variablesdemo();
		System.out.println("the value of a :"+ obj.a);
		obj.print();
		System.out.print(message);
		

	}

}


