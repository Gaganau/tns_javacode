package org.tnsif.acc.c2tc.interfacedemo;

@FunctionalInterface
interface NotificationService{
	void notifyUser(String message);
}

class EmailNotification implements NotificationService{
	public void notifyUser(String message) {
		System.out.println("New email:"+ message);
	}
}

class SMSNotification implements NotificationService{
	public void notifyUser(String message) {
		System.out.println("New email:"+ message);
	}
}
public class Functional_interfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailNotification email = new EmailNotification();
		email.notifyUser("hello");
		SMSNotification sms = new SMSNotification();
		sms.notifyUser("hi");
		
	}

}
