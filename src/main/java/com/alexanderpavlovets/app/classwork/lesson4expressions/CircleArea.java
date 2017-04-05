package com.alexanderpavlovets.app.classwork.lesson4expressions;

import java.util.Scanner;

/**
 * Created by olpav on 02/14/2017.
 * Look at presentation - and create some method that, calculates area of circle A=pi*r2.
 * Created. WTF is this! Don't like such approach.
 */
public class CircleArea {
    public static final double PI = 3.14;


    // Continue from here !!! Rewrite this shit to be valuable 

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your circle's radius:");
        double radius = scanner.nextDouble();

        System.out.println("Please enter Pi number");
        double piNumber = scanner.nextDouble();

        double circleArea = piNumber * (radius * radius);

        System.out.println("Area is " + circleArea);
    }

    //Need to rewrite this method, it should also calculate 2 areas, and then compare them
    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your area1:");
        double area1 = scanner.nextDouble();

        System.out.println("Please enter your area2:");
        double area2 = scanner.nextDouble();

        if (area1 > area2) {
            System.out.println("Area1 is bigger");
        } else {
            System.out.println("Area2 is bigger");
        }

    }
}
