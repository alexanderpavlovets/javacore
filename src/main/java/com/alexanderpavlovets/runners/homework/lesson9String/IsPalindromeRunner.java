package com.alexanderpavlovets.runners.homework.lesson9String;

import java.util.Scanner;

import static com.alexanderpavlovets.app.homework.lesson9string.IsPalindrome.isPalindromeFirst;
import static com.alexanderpavlovets.app.homework.lesson9string.IsPalindrome.isPalindromeSecond;
import static com.alexanderpavlovets.app.homework.lesson9string.IsPalindrome.isPalindromeThird;

/**
 * Created by olpav on 07/10/2017.
 */
public class IsPalindromeRunner {
    public static void runIsPalindromeCheckOfGivenString() {
        Scanner sc = new Scanner(System.in);
        boolean isAlive = true;

        while(isAlive) {

            System.out.println("Welcome to IsPalindrome check!");
            System.out.println("Please type '1', '2' or '3' in order to choose your method, or '4' to exit");
            int userChoice = sc.nextInt();
            if(userChoice == 4 ) {
                System.out.println("Bye");
                isAlive = false;
            }
            else if(userChoice == 1 || userChoice == 2 || userChoice == 3){
                System.out.println("Please enter a String that you want to check:");
                String consumeNewLineAfterInt = sc.nextLine(); // workaround to 'eat' next line from previous scanner
                String userStringToCheck = sc.nextLine();

                switch (userChoice) {
                    case 1:
                        if (isPalindromeFirst(userStringToCheck)) {
                            System.out.println("Entered string is Palindrome!");
                        } else {
                            System.out.println("Entered String isn't Palindrome");
                        }
                        break;

                    case 2:
                        if (isPalindromeSecond(userStringToCheck)) {
                            System.out.println("Entered string is Palindrome!");
                        } else {
                            System.out.println("Entered String isn't Palindrome");
                        }
                        break;

                    case 3:
                        if (isPalindromeThird(userStringToCheck)) {
                            System.out.println("Entered string is Palindrome!");
                        } else {
                            System.out.println("Entered String isn't Palindrome");
                        }
                        break;
                }
            }
            else {
                System.out.println("joking ? Couldn't enter 1-4 ... bye ! ");
                isAlive = false;
            }
        }
    }
}
