package com.alexanderpavlovets.runners.homework.lesson6arrays;

/**
 * Created by olpav on 07/06/2017.
 */
public class GetRandomIntHelper {
    public static int getRandomInt(int lowerValue, int higherValue){
        int range = (higherValue - lowerValue) + 1;
        return (int)(Math.random() * range) + lowerValue;
    }
}
