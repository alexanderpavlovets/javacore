package com.alexanderpavlovets.runners.classwork.lesson6loopss;

/**
 * Created by olpav on 03/23/2017.
 */
public class Loops {
    public static String decrease(int a, int b) {
        while(a > b ) {
            a -= a ; // a-- use this way to decrease
            System.out.println(a);
            System.out.println(b);
        }

        if (a <= b) {
            System.out.println(a);
            System.out.println(b);
        }
        return "Complete";
        // rewrite this method, it has to be testable! For now - it is not, because of only 1 return for every way
        // Don't cover this class into code-coverage.
    }

    public static void print0till10() {
        for(int i = 0; i <= 10; i++){
            System.out.println("i=" + i);
            System.out.println(10 - i );
        }
    }
    // The same with this method - do not cover it with line coverage.
}
