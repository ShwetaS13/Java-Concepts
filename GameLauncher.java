import java.io.*;
import java.util.Random;

class GameLauncher
{
	//makes a GuessGame object and tells it to startGame
	public static void main(String args[])throws IOException
	{
		GuessGame gg = new GuessGame();
		gg.startGame();
		System.out.println("Thank you for enjoying our game!");
	}
}

class GuessGame
{
	//instance variables for the three players
	int p1=0;
	int p2=0;
	int p3=0;
	boolean player1, player2, player3;
	//
	void startGame()throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Game Start!");
		System.out.println("Guess a number between 0 and 1");
		System.out.println();
		System.out.print("Player 1 guess:");
		p1 = Integer.parseInt(br.readLine());
		System.out.print("Player 2 guess:");
		p2 = Integer.parseInt(br.readLine());
		System.out.print("Player 3 guess:");
		p3 = Integer.parseInt(br.readLine());
		
		Player p = new Player();
		int guess_number = p.guess();
		System.out.println("The number to be guessed is: "+guess_number);
		
		if(guess_number==p1)
			{player1 = true;}
		else 
		if(guess_number==p2)
			{player2 = true;}
		else
		if(guess_number==p3)
			{player3 = true;}
			
		if(player1 || player2 || player3)
		{
			System.out.println("We have a winner!");
			if(player1)
				System.out.println("Player 1 with guess: "+p1);
			if(player2)
				System.out.println("Player 2 with guess: "+p2);
			if(player3)
				System.out.println("Player 3 with guess: "+p3);
		}
		else
			System.out.println("Players please try guessing again.");
	}
}

class Player
{
	//the number the player guesses
	int number; 
	
	//method for making a guess
	int guess()
	{
		return number = (int)(Math.random() * 10);
	}
}