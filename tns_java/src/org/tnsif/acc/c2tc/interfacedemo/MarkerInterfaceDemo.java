package org.tnsif.acc.c2tc.interfacedemo;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registerable s =  new Student(101,"Anil",5000,"Java");
		Registerable s1 =  new Student(102,"Nandu",3000,"Python");
		
		Object obj = new Object();
		if(obj instanceof Registerable) {
			System.out.println("Student is registered for this course");
		}else {
			System.out.println("Student is not registered for this course");
		}
		
		

	}

}
