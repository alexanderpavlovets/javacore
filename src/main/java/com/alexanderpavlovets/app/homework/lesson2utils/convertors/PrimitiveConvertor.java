package com.alexanderpavlovets.app.homework.lesson2utils.convertors;

/**
 * Created by olpav on 02/05/2017.
 */
public class PrimitiveConvertor {

    public char floatToChar(float floatIn){
        char charOut = (char) floatIn;
        System.out.println("Input float value is " + floatIn + ". Output char value is " + charOut);
        return charOut;

    }

    public char intToChar(int intIn){
        char charOut = (char) intIn;
        System.out.println("Input int value is " + intIn + ". Output char value is " + charOut);
        return charOut;
    }

    public int charToInt(char charIn){
        int intOut = (int) charIn;
        System.out.println("Input char value is " + charIn + ". Output int value is " + intOut);
        return intOut;
    }
}
