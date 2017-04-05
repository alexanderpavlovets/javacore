package com.alexanderpavlovets.runners.homework.lesson4expressions;

import com.alexanderpavlovets.app.classwork.lesson4expressions.CircleArea;

import java.util.Scanner;

/**
 * Created by olpav on 02/14/2017.
 */
public class CircleAreaRunner {
    public static void main(String[] args) {
        CircleArea circle = new CircleArea();
        boolean isAlive = true;
        Scanner sc = new Scanner(System.in);

        while (isAlive) {
            System.out.println("Welcome to the circle area calculation " +
                    "\n Please enter appropriate number to the console, in order to calculate: " +
                    "\n 1. Circle area by entered radius" +
                    "\n 2. Bigger circle area by entering 2 circle radiuses " +
                    "\n 3. To exit 'Circle radius' program");

            int userChoise = sc.nextInt();
            if (userChoise == 1) {
                System.out.println("Please enter radius of the circle, in order to calculate it's area");
                double circleAreaEntered = sc.nextDouble();
                circle.calculateAreaByGivenRadius(circleAreaEntered);
            } else if (userChoise == 2) {
                System.out.println("Please enter a radius of first circle");
                double radius1 = sc.nextDouble();
                System.out.println("Please enter a radius of second circle");
                double radius2 = sc.nextDouble();
                circle.getBiggerAreaFromTwoGivenRadiuses(radius1,radius2);
            } else if (userChoise == 3){
                System.out.println("It was a pleasure to work with you. Bye.");
                isAlive = false;
            } else {
                System.out.println("You have entered value not in range from 1 to 3. " +
                        "\nand i won't write a program further for such nice people like you! Bye!");
                isAlive = false;
            }
        }
    }
}
