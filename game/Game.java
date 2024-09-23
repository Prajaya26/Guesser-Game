package com.solution.game;

public class Game {
	
	public void start() {
		System.out.println("***********Welcome to Guesser Game************");
		System.out.println("Computer will guess a number \n you have to guess that number in 3 guesses!!");
		
		Computer c = new Computer();
		
		int comp = c.compGuess();
		
		Player p = new Player();
		
		
		Rules r = new Rules();
		boolean flag = false;
		
		int player = 0; 
		for(int i=1; i<=3; i++) {
			System.out.println("***********************************");
			System.out.println("Guess No. "+ i);
			player = p.playerGuess();
			
			flag = r.compare(comp, player);
			if(flag)
			{
				System.out.println("You Won the Game");
				
				System.out.println("Computer Guess :: " +comp);
				System.out.println("Player Guess :: " +player);
				break;
			}
			
			System.out.println("**************************************");

		}
		if(flag == false)
		{
			System.out.println("Your Guesses Are Over");
			System.out.println("Computer Guess :: " +comp);
			System.out.println("Player Guess :: " +player);
		}
		
		
	}

}
