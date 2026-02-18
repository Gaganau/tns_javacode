package org.tnsif.acc.c2tc.exceptionDemo;

public class StringIndexOutOfBoxException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java";
		try {
			System.out.println(s.charAt(4));
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
		

	}

}
