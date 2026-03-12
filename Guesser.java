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
		
		return userChoice;
	}// end menu
	
	public void humanGuesser(){
		Random r = new Random();
		int correct = 1 + r.nextInt(100);
		
		System.out.println("Guess a number 1-100... ");
		
		int keepGoing = 1;
		while(keepGoing == 1){
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
				keepGoing = 0;
			}// end else if
		}// end while
	}// end humanGuesser
	
	public void computerGuesser(){
		System.out.println("Computer guesser is blank.");
	}// end computerGuesser
}// end class def


