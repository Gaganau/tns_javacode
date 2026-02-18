package org.tnsif.acc.c2tc.interfacedemo;
interface Camera{
	void Click_a_photo();
}

interface MusicPlayer{
	void Playmusic();
}

class Smartphone1 implements Camera,MusicPlayer{
	public void Click_a_photo() {
		System.out.println("Taking photo through camera");
	}
	
	public void Playmusic() {
		System.out.println("Playing music ");
		
	}
}
public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone1 sm = new Smartphone1();
		sm.Click_a_photo();
		sm.Playmusic();

	}

}
