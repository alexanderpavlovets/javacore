package com.alexanderpavlovets.app.homework.lesson4expressions;

import com.alexanderpavlovets.app.homework.lesson3unittests.*;

/**
 * Created by olpav on 04/03/2017.
 */
public class MenuOfSimplestUtils {
    String welcome = "Welcome to the 'Simplest operations' program";
    String mainInstruction = "Please choose wanted operation, and enter appropriate number in the console";
    String additionName = "1. Add two integers;";
    String subtractionName = "2. Subtract one integer from another;";
    String multiplicationName = "3. Multiply 2 integers;";
    String divisionName = "4. Divide one integer by another;";
    String squareRootName = "5. Find square root, from your float number;";
    String maxValueName = "6. Find bigger number of two integers;";
    String minValueName = "7. Find lower number of two integers;";
    String exitName = "8. Exit the program.";
    String[] allStrings = {welcome, mainInstruction,additionName,subtractionName,multiplicationName, divisionName, squareRootName,maxValueName,minValueName, exitName};

    public String[] getAllStringsArray(){
        return this.allStrings;
    }

    public int add(int a, int b){
        Addition addition = new Addition();
        return addition.add(a,b);
    }

    public int subtract(int a, int b){
        Subtraction subtraction = new Subtraction();
        return subtraction.substract(a,b);
    }

    public int multiply(int a, int b){
        Multiplication multiplication = new Multiplication();
        return multiplication.multiply(a,b);
    }

    public int divide(int a, int b){
        Division division = new Division();
        return division.divide(a,b);
    }

    public double squareRoot(double a){
        SquareRoot squareRoot = new SquareRoot();
        return squareRoot.squareRoot(a);
    }

    public int maxValue(int a, int b){
        MaxValueInt maxValue = new MaxValueInt();
        return maxValue.getMaxOfTwoGiven(a,b);
    }

    public int minValue(int a, int b){
        MinValueInt minValue = new MinValueInt();
        return minValue.getMinOfTwoGiven(a,b);
    }
}
