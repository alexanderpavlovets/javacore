package com.alexanderpavlovets.runners.homework.lesson4expressions;

import com.alexanderpavlovets.app.classwork.lesson4expressions.IsOdd;

import java.util.Scanner;

/**
 * Created by olpav on 04/05/2017.
 */
public class IsOddRunner {
    public static void main(String[] args) {
        IsOdd isOdd = new IsOdd();
        boolean isAlive = true;
        Scanner sc = new Scanner(System.in);

        while (isAlive) {
            System.out.println("Welcome to the program, that checks, if entered by you number is Odd " +
                    "\n Please enter your int number, and you will know either it is Odd or Even " +
                    "\n '777' is a magic number, enter it, and you will exit the program");
            int enteredNumber = sc.nextInt();
            if (enteredNumber != 777) {
                isOdd.isOdd(enteredNumber);
            } else {
                System.out.println("Bye.");
                isAlive = false;
            }
        }
    }
}
