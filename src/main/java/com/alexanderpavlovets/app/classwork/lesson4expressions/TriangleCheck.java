package com.alexanderpavlovets.app.classwork.lesson4expressions;

/**
 * Created by olpav on 02/16/2017.
 * This is logic class, without any scanners and sout - to be able to be checked via unittests.
 */
public class TriangleCheck {

    public boolean isTriangle(int a, int b, int c) {
        System.out.println("Your entered numbers are " + a + " " + b + " " + c);
        if (a > 0 && b > 0 && c > 0) {

            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Yes, entered values can form a triangle.");
                return true;
            } else {
                System.out.println("Not a triangle.");
                return false;}
        } else {
            System.out.println("Not a triangle. One or more of entered by you sides is <= 0.");
            return false;
        }
    }
}
