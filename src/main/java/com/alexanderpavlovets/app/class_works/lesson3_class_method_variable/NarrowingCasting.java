package com.alexanderpavlovets.app.class_works.lesson3_class_method_variable;

/**
 * Created by olpav on 02/02/2017.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 30000000001.14159f;

    public void narrowing(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}
