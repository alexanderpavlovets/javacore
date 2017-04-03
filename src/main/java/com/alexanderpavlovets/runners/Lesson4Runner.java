package com.alexanderpavlovets.runners;

import com.alexanderpavlovets.app.homework.lesson2utils.convertors.PrimitiveConvertor;
import com.alexanderpavlovets.app.homework.lesson3unittests.*;
import com.alexanderpavlovets.app.homework.lesson4expressions.MenuForLesson4;

import java.util.Scanner;

/**
 * Created by olpav on 02/18/2017.
 */
public class Lesson4Runner {
    public static void main(String[] args) {
        MenuForLesson4.showMenu();

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {  // Entering to Primitive converter
            MenuForLesson4.showMenuPrimitiveConverter();

            int converterTypeChosen = scanner.nextInt();
            if (converterTypeChosen == 1) { // Float to char
                System.out.println("Please enter a Float value:");
                PrimitiveConvertor.floatToChar(scanner.nextFloat());
                main(args);
            } else if (converterTypeChosen == 2) { // Int to Char
                System.out.println("Please enter an Int value:");
                PrimitiveConvertor.intToChar(scanner.nextInt());
                main(args);
            } else if (converterTypeChosen == 3) { // Char to Int
                System.out.println("Please enter a Char value:");
                PrimitiveConvertor.charToInt(scanner.next().charAt(0));
                main(args);
            } else {
                System.out.println("Please make a valid choice: 1, 2 or 3");
                main(args);
            }
        } else if (userChoice == 2) { // Addition runs
            System.out.println("please enter 2 ints to be added:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Your result is " + Addition.add(a, b));
            main(args);
        } else if (userChoice == 3) { // Subtraction
            System.out.println("Please enter 2 ints to Subtract 2nd from 1st");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Your result is " + Subtraction.substract(a, b));
            main(args);
        } else if (userChoice == 4) { // Multiplication
            System.out.println("Please enter 2 ints to multiply them:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Your result is " + Multiplication.multiply(a,b));
            main(args);
        } else if (userChoice == 5) { // Division
            System.out.println("Please enter 2 ints to divide 1st with 2nd:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Your result is " + Division.divide(a,b));
            main(args);
        } else if (userChoice == 6 ){ // Square root
            System.out.println("Please enter float number to get it's square root:");
            double a = scanner.nextInt();
            System.out.println("Square root of " + a + "is " + SquareRoot.squareRoot(a));
            main(args);
        } else if (userChoice == 7) { // Max value
            System.out.println("Please enter 2 ints to see what is bigger:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(MaxValueInt.getMaxOfTwoGiven(a,b) + " is bigger");
            main(args);
        } else if (userChoice == 8){ // Min value
            System.out.println("Please enter 2 ints to see what is lower:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(MinValueInt.getMinOfTwoGiven(a,b) + " is lower");
            main(args);
        } else if (userChoice == 9) { // Form array from 3 ints
            System.out.println("Please enter 3 ints to make an array from them");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("Your array is " + FormIntArray.formArray(a,b,c)[0] + " " + FormIntArray.formArray(a,b,c)[1] + " " + FormIntArray.formArray(a,b,c)[2]);
            main(args);
        } else if (userChoice == 0){
            System.out.println("Bye");
        } else {
            System.out.println("Please make a valid choice from 0 till 9");
        }
    }
}
