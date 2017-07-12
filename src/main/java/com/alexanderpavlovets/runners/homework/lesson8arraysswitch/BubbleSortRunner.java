package com.alexanderpavlovets.runners.homework.lesson8arraysswitch;

import java.util.Scanner;

import static com.alexanderpavlovets.app.homework.lesson8arraysswitch.BubbleSortOfIntArray.bubbleSortOfArrayByAscending;
import static com.alexanderpavlovets.app.homework.lesson8arraysswitch.BubbleSortOfIntArray.bubbleSortOfArrayByDescending;
import static com.alexanderpavlovets.runners.homework.lesson6arrays.GetRandomIntHelper.getRandomInt;
import static com.alexanderpavlovets.runners.homework.lesson8arraysswitch.PrintIntArrayHelper.printArrayOfInts;

/**
 * Created by olpav on 07/07/2017.
 */
public class BubbleSortRunner {
    public static void runBubbleSortMenu() {

        Scanner sc = new Scanner(System.in);
        boolean alive = true;

        while(alive){

            System.out.println("Welcome to bubble sort of Int arrays ");
            System.out.println("Please make your choice:");
            System.out.println("1 - Sort array by ascending");
            System.out.println("2 - sort array by descending");
            System.out.println("3 - exit the program");

            int userChoice = sc.nextInt();

            switch(userChoice){
                case 1:
                    System.out.println("Enter array length: ");
                    int chosenArrayLength = sc.nextInt();
                    int[] randomArray = new int[chosenArrayLength]; //initialize an array by given length

                    System.out.println("Enter Int range of array");
                    System.out.println("Lower value:");
                    int lowerValue = sc.nextInt();
                    System.out.println("Highest value");
                    int highestValue = sc.nextInt();

                    for(int i = 0; i < randomArray.length; i++){ // making random array by given parameters
                        randomArray[i] = getRandomInt(lowerValue,highestValue);
                    }

                    System.out.println("Your initial array is: ");
                    printArrayOfInts(randomArray);
                    System.out.println("\nYour sorted by ascending array is:");
                    int[] sortedByAscArray = bubbleSortOfArrayByAscending(randomArray);
                    printArrayOfInts(sortedByAscArray);
                    System.out.println("\nBye");
                    break;

                case 2:
                    System.out.println("Enter array length: ");
                    int chosenArrayLengthDesc = sc.nextInt();
                    int[] randomArrayForDesc = new int[chosenArrayLengthDesc]; //initialize an array by given length

                    System.out.println("Enter Int range of array");
                    System.out.println("Lower value:");
                    int lowerValueDesc = sc.nextInt();
                    System.out.println("Highest value");
                    int highestValueDesc = sc.nextInt();

                    for(int i = 0; i < randomArrayForDesc.length; i++){ // making random array by given parameters
                        randomArrayForDesc[i] = getRandomInt(lowerValueDesc,highestValueDesc);
                    }

                    System.out.println("Your initial array is: ");
                    printArrayOfInts(randomArrayForDesc);
                    System.out.println("\nYour sorted by descending array is:");
                    int[] sortedByDescArray = bubbleSortOfArrayByDescending(randomArrayForDesc);
                    printArrayOfInts(sortedByDescArray);
                    System.out.println("\nBye");
                    break;

                case 3:
                    System.out.println("Bye");
                    alive = false;
                    break;

                default:
                    System.out.println("Pfff - you can't choose from 1-3. Bye! ");
                    alive = false;
            }
        }
    }
}
