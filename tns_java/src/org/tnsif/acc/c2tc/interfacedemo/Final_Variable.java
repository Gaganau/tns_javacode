package org.tnsif.acc.c2tc.interfacedemo;

class UPIApp{
	final int Max_Daily_Limit = 10000;
	
	void showLimit(){
		System.out.println("Daily transfer limit:"+ Max_Daily_Limit);
	}
}

public class Final_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPIApp upi = new UPIApp();
		upi.showLimit();

	}

}
