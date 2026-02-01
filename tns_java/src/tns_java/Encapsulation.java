package tns_java;

import basics.Encapsulation1;

class Encapsulation1 {

	   private int age;
	    private String name;
	    
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public int getAge() {
	        return age;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	}

public class Encapsulation {

	public static void main(String[] args) {
		Encapsulation1 human1=new Encapsulation1();
        human1.setAge(23);
        human1.setName("Akash");
        System.out.println(human1.getAge());
        System.out.println(human1.getName());
        
        human1.setAge(67);
        human1.setName("Sushma");
        System.out.println(human1.getAge());
        System.out.println(human1.getName());
	}

}
