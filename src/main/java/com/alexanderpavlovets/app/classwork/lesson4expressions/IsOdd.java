package com.alexanderpavlovets.app.classwork.lesson4expressions;

/**
 * Created by olpav on 02/16/2017.
 */
public class IsOdd {
    // Sasha, here you have boolean return, when writing a test for it - try to assert on 0 and 1
    public boolean isOdd(int a) {
        double b = a / 2;
        if (a == (int) b * 2) {
            System.out.println("Yes. Your entered value is " + a + " and it is Odd");
            return true;
        } else {
            System.out.println("No. Your entered value is " + a + " and it is Even");
            return false;
        }
    }
}
