package com.alexanderpavlovets.app.homework.lesson2utils;

import com.alexanderpavlovets.app.classwork.lesson2classmethodvariable.NarrowingCasting;
import com.alexanderpavlovets.app.classwork.lesson2classmethodvariable.WideningCasting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olpav on 04/05/2017.
 */
public class CastingTest {
    NarrowingCasting narrowCasting = new NarrowingCasting();
    WideningCasting wideCasting = new WideningCasting();
    @Test
    public void narrowCasting(){
        Assert.assertEquals(123, narrowCasting.narrowCastingFloatToInt(123.456f));
    }

    @Test
    public void wideCasting(){
        Assert.assertEquals(127.0d,wideCasting.widening(),0.01);
    }
}
