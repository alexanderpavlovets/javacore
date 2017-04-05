package com.alexanderpavlovets.app.classwork.lesson2classmethodvariable;

/**
 * Created by olpav on 02/02/2017.
 */
public class NarrowingCasting {

    public int narrowCastingFloatToInt(float floatIn){
        int resultInt = (int) floatIn;
        System.out.println("Your entered float number is " + floatIn + " your narrow casted int number is " + resultInt);
        return resultInt;
    }
}
