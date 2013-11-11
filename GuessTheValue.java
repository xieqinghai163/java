//first modified

/*
- Your java program needs to read the value from value.txt.
- It will then ask the user to guess the value from the file
? Guess the value in the file:
- The user will enter a value, for example 50.
o If the guessed value is greater than the value in the file, the program will say:
? The value is greater than 50, guess again:
o If the guessed value is less than the value in the file, the program will say:
? The value is less than 50, guess again:
o If the guessed value is equal to the value in the file, the program will say:
? Congratulation, you got it!
- The user will have a maximum of 5 tries to guess the value. If the user fails after 5 tries, the program will say:
? You lost :-(
 */

import java.util.*;
import java.io.*;

public class GuessTheValue
{

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        Scanner fileIn = new Scanner(new FileReader("value.txt"));
        String firstWord = fileIn.next();
        //int iVal = 57;
        int iVal = Integer.parseInt(firstWord);
        int iMaxTimes = 5;
        try
        {
            System.out.print("Guess the Value in the file(1--100):");
            int iValGuess = console.nextInt();

            int i = 1;
            boolean bFind = false;

            while (i < iMaxTimes)
            {
                if (iValGuess > iVal)
                {
                    System.out.print("The value is less then " + iValGuess + ",Guess again:");
                } else if (iValGuess < iVal)
                {
                    System.out.print("The value is greater then " + iValGuess + ",Guess again:");
                } else
                {
                    bFind = true;
                    break;
                }
                i = i + 1;
                iValGuess = console.nextInt();
            }

            if (bFind == false && iValGuess != iVal)
            {
                System.out.println("You lost :-(");
            } else
            {
                System.out.println("Congratulations! You got it!");
            }
        }
        catch  (InputMismatchException imeRef)
        {
            System.out.println("Please only input number 1--100");
        }
    }
}