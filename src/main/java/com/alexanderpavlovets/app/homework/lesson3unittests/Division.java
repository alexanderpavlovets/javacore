package com.alexanderpavlovets.app.homework.lesson3unittests;

/**
 * Created by olpav on 02/13/2017.
 */
public class Division {
    public double divide(double a, double b){
        double result = a / b;
        System.out.println("You first number is " + a);
        System.out.println("Your second number is " + b);
        System.out.println(a + " divided by " + b + " equals to "+ result);
        return result;
    }
}
