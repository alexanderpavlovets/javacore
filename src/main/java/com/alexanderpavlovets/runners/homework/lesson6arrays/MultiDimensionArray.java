package com.alexanderpavlovets.runners.homework.lesson6arrays;

import static com.alexanderpavlovets.runners.homework.lesson6arrays.GetRandomIntHelper.getRandomInt;
/**
 * Created by olpav on 07/06/2017.
 */
public class MultiDimensionArray {
    public static void printTwoDimensionArray() {
        int[][] myArray = new int[8][5];

//        this variable is used for switching on higher-ordered (8) array index
//        every higher ordered loop - it is incremented by 1
        int indexOfHigherArray = 0;

        for( int[] i : myArray){
            System.out.print("\n");
            for(int x = 0; x < i.length; x++){
                myArray[indexOfHigherArray][x] = getRandomInt(10,99);
                System.out.print(myArray[indexOfHigherArray][x] + " ");
            }
            indexOfHigherArray +=1;
        }



    }
}
