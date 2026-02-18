package org.tnsif.acc.c2tc.exceptionDemo;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		if(age < 18) {
			throw new ArithmeticException("You are not eligible for voting");
		}else {
			System.out.println("U r eligible for voting");
		}
		

	}

}
