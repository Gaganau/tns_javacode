package org.tnsif.acc.c2tc.constructors;

class Users1{
	String name;
	int age;
	Users1 (){
		name = "Guest";
		age = 0;
		System.out.println("Guest profile created");
		System.out.println("Name ->"+name + "Age ->"+ age);
	}
		
	Users1(String name,int age){
		this.name = name;
			this.age = age;
			System.out.println("User created: Name ->"+ name +"" + "Age ->"+ age);
			
		}
	}


public class ConstructorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users1 user = new Users1();
		Users1 user1 = new Users1("Gagana",21);

	}

}
