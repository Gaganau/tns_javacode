package org.tnsif.acc.c2tc.interfacedemo;

interface Vehicle2{
	void start();
	void stop();
	int MAx_speed = 30;
	
	default void repair() {
		System.out.println("Vehicle is being repaired");
	}
	
	static void checkMaintaince() {
		System.out.println("Vehicle is under maintaince");
	}
	
}

class Car2 implements Vehicle2{
	
	private String model;
	public Car2(String model) {
		super();
		this.model = model;
	}

	public void start() {
		System.out.println(" car "+ model +" "+"is starting");
	}
	
	public void stop() {
		System.out.println("car "+ model +" "+" is stopping");
	}
}

class Bike implements Vehicle2{
	private String type;
	public Bike(String type) {
		super();
		this.type = type;
	}

	public void start() {
		System.out.println(" bike "+ type +" "+"is starting");
	}
	
	public void stop() {
		System.out.println("bike "+ type +" "+" is stopping");
	}
	
}
public class Default_Static_inInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 cr = new Car2("Audi");
		Vehicle2 bike = new Bike("Duke");
		cr.start();
		cr.stop();
		cr.repair();
		bike.start();
		bike.stop();
		bike.repair();
		Vehicle2.checkMaintaince();
		System.out.println("Maximum speed of Vehicle is:"+ Vehicle2.MAx_speed);
	}

}
