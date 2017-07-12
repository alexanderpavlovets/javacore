package com.alexanderpavlovets.runners.homework.lesson6arrays;

import static com.alexanderpavlovets.runners.homework.lesson6arrays.GetRandomIntHelper.getRandomInt;

/**
 * Created by olpav on 07/06/2017.
 */
public class RandomArray0_999 {
    public static void printRandom0_999ArrayAndFinMaxMinInIt() {

        int[] myArray = new int[15];

        for(int i =0; i < 15; i++){
            myArray[i] = getRandomInt(0,999);
        }

        for(int i : myArray){
            System.out.print(i + " ");
        }
//      find max value in the array
        int maxValueinArray = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > maxValueinArray){
                maxValueinArray = myArray[i];
            }
        }
        System.out.println("\n" + "Biggest value in array is " + maxValueinArray);

//      find min value in array
        int minValueInArray = 999;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] < minValueInArray){
                minValueInArray = myArray[i];
            }
        }
        System.out.println("Lower value in array is " + minValueInArray);


    }
}
