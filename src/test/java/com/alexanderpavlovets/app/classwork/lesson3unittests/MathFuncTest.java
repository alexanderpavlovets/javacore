package com.alexanderpavlovets.app.classwork.lesson3unittests;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by olpav on 02/09/2017.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest(){
        int a = 2, b = 3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyFailedTest(){
        int a = 2, b = 3, expRes = 845;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyFailed1Test(){
        int a = 2, b = 3, expRes = 841;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}
