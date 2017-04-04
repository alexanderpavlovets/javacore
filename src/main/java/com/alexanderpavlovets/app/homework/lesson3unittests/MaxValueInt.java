package com.alexanderpavlovets.app.homework.lesson3unittests;


/**
 * Created by olpav on 02/13/2017.
 */
public class MaxValueInt {
    public int getMaxOfTwoGiven(int a,int b){
        int result;
        System.out.println("You first number is " + a);
        System.out.println("Your second number is " + b);
        if(a != b){
            result = Math.max(a,b);
            System.out.println("Your bigger number is " + result);
        }
        else{
            System.out.println("Entered numbers are equal, you result equals to 1st entered number: " + a);
            result = a;
        }
        return result;
    }
}
