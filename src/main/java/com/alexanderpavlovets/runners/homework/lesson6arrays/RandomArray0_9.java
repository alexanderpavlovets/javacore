package com.alexanderpavlovets.runners.homework.lesson6arrays;

import static com.alexanderpavlovets.runners.homework.lesson6arrays.GetRandomIntHelper.getRandomInt;

/**
 * Created by olpav on 07/06/2017.
 */
public class RandomArray0_9 {
    public static void printRandomArray0_9AndCountEvensInIt() {

        int[] myArray = new int[15];
        for(int i =0; i < 15; i++){
            myArray[i] = getRandomInt(0,9);
        }

        int amountOfEvensInArray = 0;

        // prints myArray in one string and increases counter of even numbers
        for( int i : myArray){
            System.out.print(i +" ");
            if(i % 2 == 0 ){
                amountOfEvensInArray += 1;
            }
        }
        System.out.println("\n" + "Amount of even numbers in array is " + amountOfEvensInArray);

    }


}
