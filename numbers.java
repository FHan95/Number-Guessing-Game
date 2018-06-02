/*
 * A simple game.
 * The user is asked for a name, and whether or not they want to play the game.
 * The game requires the user to guess a number between 1 to 10. It records the number of attempts made.
 * When the correct number is guessed, the program congratulates the user and displays the number of attempts made.
 * 
 * @author: Felix
 */

import java.util.Random;
import java.util.Scanner;

public class numbers
{
	Scanner reader = new Scanner(System.in);
	
	public numbers()
	{
		//Get the user's name
		System.out.println("Please enter a name.");
		String name = reader.next();
		System.out.println("Hello " + name + ".");
		
		//Asks the user if they would like to play a game
		System.out.println("Would you like to play a game? (Y/N)");
		String answer = reader.next();
		
		//Recursively asks the user for a valid response
		while(answerCheck(answer) == false)
		{
			System.out.println("Please enter a valid response.");
			System.out.println("Would you like to play a game? (Y/N)");
			answer = reader.next();
		}

		//Exits the game given the user replied no
		if(answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no"))
		{
			System.exit(0);
		}
		
		Random rand = new Random(11);
		int number = rand.nextInt(10) + 1;
		int attempts = 1;
		
		System.out.println("I am thinking of a number between 1 and 10. What is your guess?");
		int guess = reader.nextInt();
		
		//Hints for the user's next guess
		while(guess != number)
		{
			if(guess < number)
			{
				System.out.println("Try a number that is higher.");
				guess = reader.nextInt();
			}
			if(guess > number)
			{
				System.out.println("Try a number that is lower.");
				guess = reader.nextInt();
			}
			
			attempts += 1;
		}
		
		//Given that the user guessed the correct number
		if(guess == number)
		{
			if(attempts == 1)
				System.out.println("Congrats! The number was " + number + ". You made " + attempts + " attempt.");
			else
				System.out.println("Congrats! The number was " + number + ". You made " + attempts + " attempts.");
		}
	}
	
	//This function checks the user response to see if it is a valid response
	public boolean answerCheck(String answer)
	{
		if(answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no") || answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes"))
			return true;
		else
			return false;
	}
	
	//Runs the program
	public static void main (String[] args)
	{
		numbers main = new numbers();
	}
}
