package org.tnsif.acc.c2tc.exceptionDemo;
import java.io.IOException;

public class ThrowsDemo {
	void m1() {
		System.out.println("No exception");
	}
	
	void m2() throws IOException{
		System.out.println("device Error");
	}
	
	void m3() throws ArithmeticException , IOException ,ClassNotFoundException{
		System.out.println("File not found error");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo d = new ThrowsDemo();
		d.m1();
		
		try {
			d.m2();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			d.m3();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
