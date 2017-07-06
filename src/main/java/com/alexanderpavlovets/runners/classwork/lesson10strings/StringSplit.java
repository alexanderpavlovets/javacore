package com.alexanderpavlovets.runners.classwork.lesson10strings;

import java.util.Scanner;

/**
 * Created by olpav on 05/11/2017.
 */

// Task is to get a string from user and count amount of entered words

public class StringSplit {
    public static void main(String[] args) {
        System.out.println("Enter a random string with words that are separated by spaces:");
        Scanner scanner = new Scanner(System.in);
        String inputOfTheUser = scanner.nextLine();
        String[] splittedWordsArray = inputOfTheUser.split(" ");
        System.out.println("Amount of the words in entered string is " + splittedWordsArray.length);
    }

}

// it is good here to have a check in the code, that delete spaces if there is more than 1