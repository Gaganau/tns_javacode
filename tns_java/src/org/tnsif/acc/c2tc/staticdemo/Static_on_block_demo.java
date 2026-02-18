package org.tnsif.acc.c2tc.staticdemo;

class Game{
	static int maxLevel;
	
	static {
		System.out.println("Initializing game first");
		maxLevel = 50;
	}
	
	void showLevelinfo() {
		System.out.println("Game has" +" "+ maxLevel+" "  + "level");
	}
}

public class Static_on_block_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.showLevelinfo();

	}

}
