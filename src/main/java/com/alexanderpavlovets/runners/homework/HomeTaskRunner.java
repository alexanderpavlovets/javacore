package com.alexanderpavlovets.runners.homework;

import java.util.Scanner;

import static com.alexanderpavlovets.runners.homework.lesson2utils.PrimitiveConvertorRunner.runPrimitiveConvertor;
import static com.alexanderpavlovets.runners.homework.lesson4expressions.MenuOfExpressionsRunner.runExpressions;
import static com.alexanderpavlovets.runners.homework.lesson4expressions.MenuOfSimplestUtilsRunner.runSimpleUtils;
import static com.alexanderpavlovets.runners.homework.lesson6arrays.ArraysMenu.justPrintArraysInDifferentWays;
import static com.alexanderpavlovets.runners.homework.lesson8arraysswitch.BubbleSortRunner.runBubbleSortMenu;
import static com.alexanderpavlovets.runners.homework.lesson9String.IsPalindromeRunner.runIsPalindromeCheckOfGivenString;

/**
 * Created by olpav on 07/10/2017.
 */
public class HomeTaskRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAlive = true;

        while(isAlive) {

            System.out.println("Welcome to the HomeWork runner! " +
                    "\n Please make you choice, what to run:" +
                    "\n 1 - lesson2 - PrimitiveConverter" +
                    "\n 2 - lesson3 - Simple utils program" +
                    "\n 3 - lesson4 - Expressions" +
                    "\n 4 - lesson6 - Arrays" +
                    "\n 5 - lesson8 - Bubble sort" +
                    "\n 6 - lesson9 - Check if given String is palindrome");

            int userChoice = sc.nextInt();

            switch(userChoice){
                case 1:
                    runPrimitiveConvertor();
                    break;

                case 2:
                    runSimpleUtils();
                    break;

                case 3:
                    runExpressions();
                    break;

                case 4:
                    justPrintArraysInDifferentWays();
                    break;

                case 5:
                    runBubbleSortMenu();
                    break;

                case 6:
                    runIsPalindromeCheckOfGivenString();
                    break;

                default:
                    System.out.println("You entered the number not from the list" +
                            "\n Do you want to continue?" +
                            "\n 1 - Yes. I will continue." +
                            "\n 2 - No. Bye!");
                    int exitOrStay = sc.nextInt();
                    switch(exitOrStay){
                        case 1: break;
                        case 2: isAlive = false; break;
                        default :
                            System.out.println("Are you drunk ? Bye!");
                            isAlive = false;
                    }
            }

        }
    }
}
