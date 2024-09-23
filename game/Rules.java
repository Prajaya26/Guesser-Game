package com.solution.game;

public class Rules {
	
	public boolean compare(int comp, int player)
	{
		boolean flag = false;
		
		if(comp == player)
		{
			System.out.println("Correct Guess");
		}
		else if(comp < player)
		{
			System.out.println("Wrong Guess, Guess lower");
		}
		else if(comp > player)
		{
			System.out.println("Wrong Guess, Guess Higher");
		}
		return flag;
	}
	
}
