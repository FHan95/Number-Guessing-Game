
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
		
	}
	
	//This function checks the user response to see if it is a valid response
	public boolean answerCheck(String answer)
	{
		if(answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no") || answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes"))
			return true;
		else
			return false;
	}
	
	public static void main (String[] args)
	{
		numbers main = new numbers();
	}
	
}
