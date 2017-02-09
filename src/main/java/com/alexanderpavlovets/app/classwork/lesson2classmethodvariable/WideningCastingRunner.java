package com.alexanderpavlovets.app.classwork.lesson2classmethodvariable;

/**
 * Created by olpav on 02/02/2017.
 */
public class WideningCastingRunner {
    public static void main(String[] args) {
        WideningCasting casting1 = new WideningCasting();
        casting1.widening();

        NarrowingCasting narrowing_casting1 = new NarrowingCasting();
        narrowing_casting1.narrowing();
    }
}
