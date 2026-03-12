# CS121_Project8

## Algorithm
```
import java.util.*

make class called Guesser:
    main():
        the menu, the main loop, the human guesser, and the computer guesser
        call new Guesser()

    Guesser():
        boolean keepGoing = true
        while keepGoing is true:
            string userChoice = menu()
            if userChoice =0:
                keepGoiing = false
            else if userChoice = 1:
                call humanGuesser()
            else if userCHoice = 2:
                call computer guesser

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
            
    public string  menu():
        print "0) Exit"
        print "1) Guess the number"
        print "2) have the computer guess your number"

        take input into string userInput
        return userInput

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
        integer upperBound = 100
        integer lowerBound = 50
        print "Enter H for too high, L for too low or C for correct"
        
        boolean keepGoin = true;
        while keepGoing = true:
            take user input put in string called status
            convert status to lowercase
           

            if status = 'h':
                upperBound = guess
                double dbGuess = guess - [(guess - lower) * 0.5]
                guess = cast bdGuess to int
                print "Computer guesses" guess
            else if status = 'l'::
                lowerBoun = guess
                double dbGuess = guess + [(upper - guess) * 0.5]
                guess = cast floatGuess to int
                print "Computer guesses" guess
            else if status = 'c'
                print "Computer guessed the number!"
                keepGoing = 0
            else:
                print "Please enter l, h, or c"
