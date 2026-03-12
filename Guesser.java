import java.util.*;

public class Guesser {
	public static void main(String[] args) {
		new Guesser();
	}// end main
	
	public Guesser(){
		boolean keepGoing = true;
		while(keepGoing){
			String userChoice = this.menu();
			if(userChoice.equals("0")){
				keepGoing = false;
			} else if(userChoice.equals("1")){
				this.humanGuesser();
			} else if (userChoice.equals("2")){
				this.computerGuesser();
			}// end if
		}// end while
	}// end constructor
	
	public String menu(){
		System.out.println("0) Exit");
		System.out.println("1) guess a number");
		System.out.println("2) computer guesses your number");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0, 1, or 2: ");
		String userChoice = input.nextLine();
		
		System.out.println();	
		return userChoice;
	}// end menu
	
	public void humanGuesser(){
		Random r = new Random();
		int correct = 1 + r.nextInt(100);
		
		System.out.println("Guess a number 1-100... ");
		
		boolean keepGoing = true;
		while(keepGoing){
			int guess = 0;
			try {
			System.out.print("Enter a number: ");
			Scanner input = new Scanner(System.in);
			String strGuess = input.nextLine();

			guess = Integer.parseInt(strGuess);
			} catch (NumberFormatException e){
				System.out.println("Please input a number like: 0, 1, 2 etc");
			}// end try
			
			if(guess < correct){
				System.out.println("Too low.");
			} else if(guess > correct){
				System.out.println("Too high.");
			} else if(guess == correct){
				System.out.println("You got it! Well done.");
				keepGoing = false;
			}// end else if
		}// end while
		System.out.println();
	}// end humanGuesser
	
	public void computerGuesser(){
		System.out.println("Think of a number from 1-100...");
		System.out.println("After each guess, enter 'h' for too high, 'l' for too low, or 'c' for correct!");
		System.out.println();

		int lower = 0;
		int upper = 100;
		int guess = 50;
		System.out.println("Computer guesses: " + guess);

		boolean keepGoing = true;
		while(keepGoing){
			System.out.print("Too high, too low, or correct? ");
			Scanner input = new Scanner(System.in);
			String status = input.nextLine();
			System.out.println();
			
			status = status.toLowerCase();
			if(status.equals("h")){
				upper = guess;
				double dbGuess = guess - ((guess - lower) * 0.5);
				guess = (int) dbGuess;
				System.out.println("Computer guesses: " + guess);
			} else if(status.equals("l")){
				lower = guess;
				double dbGuess = guess + ((upper - guess) * 0.5);
                                guess = (int) dbGuess;
				System.out.println("Computer guesses: " + guess);
			} else if(status.equals("c")){
				System.out.println("Computer guessed the number!");
				keepGoing = false;
			} else {
				System.out.println("Please enter h, l, or c");
			}// end else if

		}// end while
	System.out.println();
	}// end computerGuesser
}// end class def


