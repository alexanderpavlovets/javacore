package com.alexanderpavlovets.app.homework.lesson2utils.runners;

import com.alexanderpavlovets.app.homework.lesson2utils.convertors.PrimitiveConvertor;

/**
 * Created by olpav on 02/05/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(80.0f);
        convertor.intToChar(36);
        convertor.charToInt('f');
    }
}