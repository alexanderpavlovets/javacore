package com.alexanderpavlovets.app.homework.lesson4expressions;

/**
 * Created by olpav on 02/18/2017.
 */
public class MenuForLesson4 {
    public static void showMenu(){
        System.out.println("Welcome to the main menu");
        System.out.println("To run appropriate calculation, please make your choice:");
        System.out.println("1 - Primitive converter");
        System.out.println("2 - Addition");
        System.out.println("3 - Subtraction");
        System.out.println("4 - Multiplication");
        System.out.println("5 - Division");
        System.out.println("6 - Square root");
        System.out.println("7 - Max value from ints");
        System.out.println("8 - Min value from ints");
        System.out.println("9 - Form array from given ints");
        System.out.println("0 - Exit the program");
    }

    public static void showMenuPrimitiveConverter(){
        System.out.println("Welcome to Primitive converter. ");
        System.out.println("What data do you want to convert?");
        System.out.println("Float to Char - enter '1'");
        System.out.println("Int to Char - enter '2'");
        System.out.println("Char to Int - enter '3'");
    }
}
