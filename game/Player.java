package com.solution.game;

import java.util.Scanner;
public class Player {

	
	public int playerGuess()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your Guess :: ");
		
		int player = sc.nextInt();
		if(player > 0 && player < 11) {
			return player;
		}
		else {
			System.out.println("Invalid Guess!!! Please Try Again");
		}
		
		return 0;
	}
}
