package com.alexanderpavlovets.app.homework.lesson8arraysswitch;

/**
 * Created by olpav on 07/07/2017.
 */
public class BubbleSortOfIntArray {
    public static int[] bubbleSortOfArrayByAscending(int[] givenArray){

        boolean swapFlag = true; // set flag to true, in order to begin first pass
        int tempInt; // holding temp variable, to switch index of array's values if necessary

        while(swapFlag){
            swapFlag = false; //set to false, awaiting a possible swap
            for (int i = 0; i < givenArray.length - 1; i++){
                if(givenArray[i] > givenArray[i + 1]){ // if true - swap elements and set swap to true
                    tempInt  = givenArray[i];
                    givenArray[i] = givenArray[i + 1];
                    givenArray[i + 1] = tempInt;
                    swapFlag = true;
                }
            }
        }
        return givenArray;
    }

    public static int[] bubbleSortOfArrayByDescending(int[] givenArray){

        boolean swapFlag = true; // set flag to true, in order to begin first pass
        int tempInt; // holding temp variable, to switch index of array's values if necessary

        while(swapFlag){
            swapFlag = false; //set to false, awaiting a possible swap
            for (int i = 0; i < givenArray.length - 1; i++){
                if(givenArray[i] < givenArray[i + 1]){ // if true - swap elements and set swap to true
                    tempInt  = givenArray[i];
                    givenArray[i] = givenArray[i + 1];
                    givenArray[i + 1] = tempInt;
                    swapFlag = true;
                }
            }
        }
        return givenArray;
    }

}
