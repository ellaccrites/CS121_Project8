# CS121_Project8

## Algorithm
```
import java.util.*
make class called Guesser:
    main():
        the menu, the main loop, the human guesser, and the computer guesser
        call new Guesser()
        
    public Guesser():
        integer keepGoing = 1
        while keepGoing = 1:
            userInput =  menu()
            if userInput = 0:
                keepGoing = 0
            else if userInput = 1:
                call humanGuesser()
            else if userInput = 2:
                call computerGuesser()
            
    public integer menu():
        print "0) Exit"
        print "1) Guess the number"
        print "2) have the computer guess your number"

        take input into string userInput
        make userInput a integer called  userInt

        return userInt

    public void humanGuesser();
        generate random number 1-100 and put in integer called number
        
        print "Guess a number 1-100"
        integer keepGoing = 1
        while keepGoing = 1:
            take user input and convert to integer
            put in integer called guess

            if guess is less than number:
                print "Too low. Guess again."
            else if guess is greater than number:
                print "Too high. Guess again."
            else if guess = number:
                print "You got it right! Well done."
                keepGoing = 0;
    
    public void computerGuesser():
        print "Think of a number from 1-100"
        print "Computer guesses 50"
        int oldGuess = 0
        int guess = 50
        print "Enter H for too high, L for too low or C for correct"
        
        int keepGoing = 1
        while keepGoing = 1
            take user input put in string called status
            convert status to lowercase
            
            if status = 'l':
                float floatGuess = guess + [(guess - oldGuess) * 0.5]
                oldGuess = guess
                guess = cast floatGuess to int
                print "Computer guesses" guess
            else if status = 'h'::
                float floatGuess = guess - [(guess - oldGuess) * 0.5]
                oldGuess = guess
                guess = cast floatGuess to int
                print "Computer guesses" guess
            else if status = 'c'
                print "Computer guessed the number!"
                keepGoing = 0
                
