package tns_java;


class Car{
	void travel() {
		System.out.println("car is used for transportation");
	}
}

class Maruthi extends Car{
	void speed() {
		System.out.println("Maruthi car travels much faster");
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruthi maruthi = new Maruthi();
		maruthi.travel();
		maruthi.speed();

	}

}
