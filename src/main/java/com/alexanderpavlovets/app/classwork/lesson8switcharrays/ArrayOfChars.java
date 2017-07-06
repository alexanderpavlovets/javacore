package com.alexanderpavlovets.app.classwork.lesson8switcharrays;

import java.util.Arrays;

/**
 * Created by olpav on 04/20/2017.
 */
public class ArrayOfChars {
    public void formArrayOfChar(int length){
        char[] someArray = new char[length];
        for(int i = 0; i < someArray.length; i++){
            someArray[i] = (char)i;
        }
        String resultString = Arrays.toString(someArray);
        System.out.println(resultString);
    }
}

// rewrite to return maybe
// cover this sheet with tests
