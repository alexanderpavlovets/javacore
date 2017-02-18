package com.alexanderpavlovets.app.classwork.lesson4expressions;

/**
 * Created by olpav on 02/16/2017.
 * This is runner - just runs the code and works. Class TriagleCheck is only logic - it should be covered by
 * unit testing.
 */
public class TriangleCheckRunner {
    static int a = 3;
    static int b = 4;
    static int c = 5;

    public static void main(String[] args) {
        if(TriangleCheck.isTriangle(a,b,c)){
            System.out.println("These variables are eligible for triangle");
        }
        else {
            System.out.println("Not a triangle");
        }
    }
}
