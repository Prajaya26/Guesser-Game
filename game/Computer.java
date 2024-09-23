package com.solution.game;

import java.util.Random;
public class Computer {

	public int compGuess() {
		
		Random r = new Random();
		
		int comp = r.nextInt(1,11);
		System.out.println("\nComputer Guess his number");
		return comp;
	}

}
