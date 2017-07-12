package com.alexanderpavlovets.runners.homework.lesson6arrays;

/**
 * Created by olpav on 07/03/2017.
 */
public class ArraysInLineAndColumnPlusViceVersaPrinting {
    public static void printHardcodedArrays() {

//        TASK 1
        int[] array = new int[10];
        int indexOfFirstArray = 0;

        for(int i = 2; i < 21; i++){
            if(i % 2 == 0){
               array[indexOfFirstArray] = i;
               indexOfFirstArray += 1;
            }
        }
//      prints array in the line with 'space' delimiter
        for(int i : array){
            System.out.print(i +" ");
        }
//        prints array in the column
        for(int i : array){
            System.out.print("\n" + i);
        }


//        TASK 2
        int[] array2 = new int[50];
        int indexOfSecondArray = 0;

        for(int i =1; i < 100; i++){
            if( i % 2 != 0){
                array2[indexOfSecondArray] = i;
                indexOfSecondArray +=1;
            }
        }
//      prints array2 in the line with 'space' delimiter
        System.out.print("\n");
        for(int i : array2){
            System.out.print(i +" ");
        }

//        prints array2 vice-versa
        System.out.print("\n");
        for(int i = array2.length - 1; i >= 0; i--){
            System.out.print(array2[i] + " ");
        }
    }
}
