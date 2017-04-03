package com.alexanderpavlovets.runners.homework.lesson4expressions;

import com.alexanderpavlovets.app.homework.lesson4expressions.MenuOfSimplestUtils;

import java.util.Scanner;

/**
 * Created by olpav on 04/03/2017.
 */
public class MenuOfSimplestUtilsRunner {
    public static void main(String[] args) {
        MenuOfSimplestUtils menu = new MenuOfSimplestUtils();
        boolean alive = true;
        // Main logic of Runner is here
        while(alive){
            // write the menu itself
            for(String i : menu.getAllStringsArray()){
                System.out.println(i);
            }

            // Waiting from user to enter desired operation
            Scanner sc = new Scanner(System.in);
            int userChoiceOfOperation = sc.nextInt();

            //switch() case: is better here, but we didn't learned it yet. So for now - a lot of IFs
            if (userChoiceOfOperation == 1) { // Addition logic
                System.out.println("Welcome to Addition operation");
                System.out.println("Please enter 1st integer number");
                int first = sc.nextInt();
                System.out.println("Please enter 2nd integer number");
                int second = sc.nextInt();
                menu.add(first, second);
            }

            else if(userChoiceOfOperation == 2){ //Subtraction logic
                System.out.println("Welcome to Subtraction operation");
                System.out.println("Please enter an integer number, that you want to subtract from");
                int first = sc.nextInt();
                System.out.println("Please enter 2nd integer number, that you want to subtract from first one");
                int second = sc.nextInt();
                menu.subtract(first, second);
            }

            else if(userChoiceOfOperation == 3 ) { // Multiplication logic
                System.out.println("Welcome to Multiplication operation");
                System.out.println("Please enter 1st integer number");
                int first = sc.nextInt();
                System.out.println("Please enter 2nd integer number");
                int second = sc.nextInt();
                menu.multiply(first, second);
            }

            else if(userChoiceOfOperation == 4){ //Division logic
                System.out.println("Welcome to Division operator");
                System.out.println("Please enter an integer number, that you want to be divided");
                int first = sc.nextInt();
                System.out.println("Please enter 2nd integer number, that will divide first one");
                int second = sc.nextInt();
                menu.divide(first, second);
            }

            else if(userChoiceOfOperation == 5){ //Square root logic
                System.out.println("Welcome to Square Root operator");
                System.out.println("Please enter a double number, in order to see it's square root");
                int first = sc.nextInt();
                menu.squareRoot(first);
            }

            else if(userChoiceOfOperation == 6){ //Max Value among 2 integers logic
                System.out.println("Welcome to Max Value operator");
                System.out.println("Please enter 1st integer number, that will be compared");
                int first = sc.nextInt();
                System.out.println("Please enter 2nd integer number, that will be compared");
                int second = sc.nextInt();
                menu.maxValue(first, second);
            }

            else if(userChoiceOfOperation == 7){ //Min Value among 2 integers logic
                System.out.println("Welcome to Min Value operator");
                System.out.println("Please enter 1st integer number, that will be compared");
                int first = sc.nextInt();
                System.out.println("Please enter 2nd integer number, that will be compared");
                int second = sc.nextInt();
                menu.minValue(first, second);
            }

            else if(userChoiceOfOperation == 8) {
                System.out.println("It was a pleasure to work with you. Bye.");
                alive = false;
            }

            else{
                System.out.println("You have entered value isn't from the list! Do you want to continue?");
                System.out.println("1. Yes. I want to continue");
                System.out.println("2. No. I don't want to continue.");
                int userLastChanceChoice = sc.nextInt();
                if(userLastChanceChoice == 1){}
                else if(userLastChanceChoice == 2) {
                    System.out.println("Bye bye!");
                    alive = false;
                }
                else{
                    System.out.println("Please make a choice between 1 and 2");
                }
            }
            // Add more user-friendly string into Operators themselfs !!!
        }
    }
}
