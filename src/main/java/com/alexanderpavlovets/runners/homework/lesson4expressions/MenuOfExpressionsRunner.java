package com.alexanderpavlovets.runners.homework.lesson4expressions;

import com.alexanderpavlovets.app.homework.lesson4expressions.MenuOfExpressions;

import java.util.Scanner;

/**
 * Created by olpav on 04/05/2017.
 */
public class MenuOfExpressionsRunner {
    public static void runExpressions() {
        MenuOfExpressions menu = new MenuOfExpressions();
        boolean isAlive = true;
        Scanner sc = new Scanner(System.in);

        while(isAlive){
            System.out.println("Welcome! Here you can make some basic math operations " +
                    "\n Please enter a number, that corresponds to desired action:" +
                    "\n 1. Calculate circle area by given radius " +
                    "\n 2. Find out what circle's area is bigger, if only 2 radiuses are known" +
                    "\n 3. Check if entered number either Odd or Even" +
                    "\n 4. Verify if 3 given number is able to form a triangle" +
                    "\n 5. Exit");

            int userChoice = sc.nextInt();

            switch (userChoice){
                case 1: System.out.println("Welcome to circle are calculation" +
                        "\n Please give a value of circle radius:");
                        double radius = sc.nextDouble();
                        menu.calculateCircleArea(radius);
                        break;
                case 2: System.out.println("Welcome to bigger circle area finder" +
                        "\n radius 1:");
                        double r1 = sc.nextDouble();
                        System.out.println("radius 2:");
                        double r2 = sc.nextDouble();
                        menu.getBiggerCircleArea(r1,r2);
                        break;
                case 3: System.out.println("Please enter a number, in order to check if it is Odd or Even");
                        int enteredNumber = sc.nextInt();
                        menu.checkIfNumberIsOdd(enteredNumber);
                        break;
                case 4: System.out.println("Please enter 3 numbers, that corresponds to your possible triangle sides:");
                        int side1 = sc.nextInt();
                        int side2 = sc.nextInt();
                        int side3 = sc.nextInt();
                        menu.checkIfThreeNumberCanFormTriangle(side1,side2,side3);
                        break;
                case 5: System.out.println("Bye!");
                        isAlive = false;
                        break;
                default: System.out.println("You have entered value not in range 1-5. Bye!");
                        isAlive = false;

            }


//            Old implementation, before switch/case refactor
//            if(userChoice == 1){
//                System.out.println("Welcome to circle are calculation" +
//                        "\n Please give a value of circle radius:");
//                double radius = sc.nextDouble();
//                menu.calculateCircleArea(radius);
//            } else if(userChoice == 2){
//                System.out.println("Welcome to bigger circle area finder" +
//                        "\n radius 1:");
//                double r1 = sc.nextDouble();
//                System.out.println("radius 2:");
//                double r2 = sc.nextDouble();
//                menu.getBiggerCircleArea(r1,r2);
//            } else if (userChoice == 3 ) {
//                System.out.println("Please enter a number, in order to check if it is Odd or Even");
//                int enteredNumber = sc.nextInt();
//                menu.checkIfNumberIsOdd(enteredNumber);
//            } else if (userChoice == 4){
//                System.out.println("Please enter 3 numbers, that corresponds to your possible triangle sides:");
//                int side1 = sc.nextInt();
//                int side2 = sc.nextInt();
//                int side3 = sc.nextInt();
//                menu.checkIfThreeNumberCanFormTriangle(side1,side2,side3);
//            } else if (userChoice == 5){
//                System.out.println("Bye!");
//                isAlive = false;
//            } else {
//                System.out.println("You have entered value not in range 1-5. Bye!");
//                isAlive = false;
//            }
        }

    }
}
