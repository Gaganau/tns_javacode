package org.tnsif.acc.c2tc.interfacedemo;

interface SmartDevice
{
	void turnOn();
	void turnOff();
	void getStatus();
}

class SmartLight implements SmartDevice
{

	@Override
	public void turnOn() {
		System.out.println("Smart Light is ON");		
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Light is OFF");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light is in active mode");
		
	}
	
}

public class Interfacedemo1 {

	public static void main(String[] args) {
		SmartDevice device=new SmartLight ();
		device.turnOn();
		device.turnOff();
		device.getStatus();

	}

}
