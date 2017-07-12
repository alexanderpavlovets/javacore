package com.alexanderpavlovets.runners.homework.lesson6arrays;

import java.util.Scanner;

import static com.alexanderpavlovets.runners.homework.lesson6arrays.ArraysInLineAndColumnPlusViceVersaPrinting.printHardcodedArrays;
import static com.alexanderpavlovets.runners.homework.lesson6arrays.MultiDimensionArray.printTwoDimensionArray;
import static com.alexanderpavlovets.runners.homework.lesson6arrays.RandomArray0_9.printRandomArray0_9AndCountEvensInIt;
import static com.alexanderpavlovets.runners.homework.lesson6arrays.RandomArray0_999.printRandom0_999ArrayAndFinMaxMinInIt;

/**
 * Created by olpav on 07/12/2017.
 */
public class ArraysMenu {
    public static void justPrintArraysInDifferentWays(){
        Scanner sc = new Scanner(System.in);
        boolean isAlive = true;

        while(isAlive){
            System.out.println("Welcome to the Arrays Lesson menu, make you choice: " +
                    "\n 1 - Just print hardcoded arrays in different ways" +
                    "\n 2 - Print random array 0-9 and count even numbers in it" +
                    "\n 3 - Print random array 0-999 and find max and min in it" +
                    "\n 4 - Print 2 dimension array with 8 rows and 5 columns" +
                    "\n 5 - Exit Arrays Lesson");

            int userChoise = sc.nextInt();
            switch(userChoise){
                case 1:
                    printHardcodedArrays();
                    break;

                case 2:
                    printRandomArray0_9AndCountEvensInIt();
                    break;

                case 3:
                    printRandom0_999ArrayAndFinMaxMinInIt();
                    break;

                case 4:
                    printTwoDimensionArray();
                    break;

                case 5:
                    System.out.println("Bye!");
                    isAlive = false;
                    break;

                default:
                    System.out.println("Ohhhh common !!!! Just make it 1-5 ... but next time! Bye! ");
                    isAlive = false;
                    break;
            }
        }
    }
}
