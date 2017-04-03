package com.alexanderpavlovets.runners.homework.lesson2utils;

import com.alexanderpavlovets.app.homework.lesson2utils.convertors.PrimitiveConvertor;

/**
 * Created by olpav on 04/03/2017.
 */
public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(80.0f);

        convertor.charToInt('a');

        convertor.intToChar(36);
    }
}
