package org.tnsif.acc.c2tc.exceptionDemo;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		
		try {
			int i  = arr[5];
			System.out.println(i);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
		
		
	}

}
