package org.tnsif.acc.c2tc.constructors;

class Addition{
	
	int a;
	int b;
	int c;
	
	Addition (){
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("addition:"+ c);
	}
	
	Addition(int a ,int b){
		this.a = a;
		this.b = b;
		int c = a+b;
		System.out.println("addition:"+ c);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		Addition add1 = new Addition(10,20);

	}

}
