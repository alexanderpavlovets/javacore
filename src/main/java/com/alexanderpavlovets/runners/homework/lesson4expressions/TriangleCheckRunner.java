package com.alexanderpavlovets.runners.homework.lesson4expressions;

import com.alexanderpavlovets.app.classwork.lesson4expressions.TriangleCheck;

import java.util.Scanner;

/**
 * Created by olpav on 02/16/2017.
 * This is runner - just runs the code and works. Class TriagleCheck is only logic - it should be covered by
 * unit testing.
 */
public class TriangleCheckRunner {
    public static void main(String[] args) {
        TriangleCheck triangleCheck = new TriangleCheck();
        boolean isAlive = true;
        Scanner sc = new Scanner(System.in);

        while (isAlive) {
            System.out.println("Welcome to 'Is triangle' check" +
                    "\n In order to check if your values can form a triangle, please enter 3 int values(sides):" +
                    "\n 777 is a magic number, type it to exit" +
                    "\n 1st:");
            int firstChoice = sc.nextInt();
            if (firstChoice != 777) {
//                int side1 = sc.nextInt();
                System.out.println("2nd:");
                int side2 = sc.nextInt();
                System.out.println("3rd:");
                int side3 = sc.nextInt();
                triangleCheck.isTriangle(firstChoice,side2,side3);
            } else {
                System.out.println("Bye!");
                isAlive = false;
            }
        }

    }
}
