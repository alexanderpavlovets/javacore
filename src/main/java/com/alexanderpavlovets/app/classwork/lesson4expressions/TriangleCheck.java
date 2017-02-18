package com.alexanderpavlovets.app.classwork.lesson4expressions;

import java.util.Scanner;

/**
 * Created by olpav on 02/16/2017.
 * This is logic class, without any scanners and sout - to be able to be checked via unittests.
 */
public class TriangleCheck {

    public static boolean isTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {

            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                return true;
            } else return false;
        }
        else return false;
    }
}
