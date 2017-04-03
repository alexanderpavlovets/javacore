package com.alexanderpavlovets.app.homework.lesson2utils;

import com.alexanderpavlovets.app.homework.lesson2utils.convertors.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olpav on 04/03/2017.
 */
public class PrimitiveConvertorTest {
    PrimitiveConvertor converter = new PrimitiveConvertor();
    @Test
    public void floatToChar(){
        float floatIn = 80.0f;
        char expRes = 'P';
        Assert.assertEquals(expRes,converter.floatToChar(floatIn));
    }

    @Test
    public void charToInt(){
        char charIn = 'a';
        int expRes = 97;
        Assert.assertEquals(expRes,converter.charToInt(charIn));
    }

    @Test
    public void intToChar(){
        int intIn = 36;
        char expRes = '$';
        Assert.assertEquals(expRes,converter.intToChar(intIn));
    }
}

