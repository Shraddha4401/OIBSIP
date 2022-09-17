/**Task 2-Number Guessing Game**/

import java.util.*;
class NumberGuessingGame
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int randomNumber,guessNumber;
int count=0,attempt=1;

System.out.println("-----------------------------------------------");
System.out.println(".......Number Guessing Game........");
System.out.println("-----------------------------------------------");
System.out.println("You have Maximum 5 Attempt Limit");

randomNumber=1+(int)(100*Math.random());
System.out.println("Enter a guess number between 1 to 100:");

boolean win=false;

while(win == false)
{
	guessNumber=scan.nextInt();
	if(attempt<5)
	{
		if(guessNumber == randomNumber)
		{
			System.out.println();
			System.out.println("You Guessed it! You Win the Game!");
			System.out.println("Your Guessed Number is Correct.It only took you "+attempt+ " guesses to get it correct");
			win=true;
		}
		else if(guessNumber < randomNumber)
		{
			System.out.println();
			System.out.println("Your Guess Number is Smaller.");
			System.out.println("You need to guess again..");
		}
		else if(guessNumber > randomNumber)
		{
			System.out.println();
			System.out.println("Your Guess Number is Greater.");
			System.out.println("You need to guess again..");
		}
	}
	else if(attempt==5)
	{
		if(guessNumber == randomNumber)
		{
			System.out.println();
			System.out.println("You Guessed it! You Win the Game!");
			System.out.println("Your Guessed Number is Correct.It only took you "+attempt+ " guesses to get it correct");
			win=true;
		}
		if(guessNumber != randomNumber)
		{
			System.out.println();
			System.out.println("You have exceeded the maximum attempt. Try Again \nThe correct random number is "+randomNumber);
		}
	}
	attempt++;
}
}
}			