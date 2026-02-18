package org.tnsif.acc.c2tc.exceptionDemo;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = null;
		try {
			System.out.println(st.length());
		}catch(NullPointerException e) {
			System.out.println("null pointer exception is handled");
		}
		System.out.println("rest of the code");
		
		
	}

}
