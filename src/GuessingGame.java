/*
import scanner
declare class
declare vars for input, num
prompt user to input a number
declare while loop
define conditions
   while wrong
    prompt user
   else
   print correct
   end
 */

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input;
        int guessedNum;
        int myNumber = 75;


        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");
        input = new Scanner(System.in);
        guessedNum = input.nextInt();

        while (guessedNum != myNumber) {
            System.out.println("Sorry. Try again.");
            main(new String[] {});
            break;
        }

        if (guessedNum == myNumber) {
            System.out.printf("Congrats! My number was %d.", myNumber);
        }

    }
}
