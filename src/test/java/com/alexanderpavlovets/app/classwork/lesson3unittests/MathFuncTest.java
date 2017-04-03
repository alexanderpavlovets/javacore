package com.alexanderpavlovets.app.classwork.lesson3unittests;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by olpav on 02/09/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFuncTest {

    public final String RESOURCES_PATH = "src/test/java/resources/";

    @Test
    public void multiplyTest(){
        int a = 2, b = 3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @FileParameters(RESOURCES_PATH + "multiply_parameters.csv")
    @Test
    public void multiplyTest1(int a, int b, int expRes){
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplTest2(){
        int a = 2, b = 3, expRes = 841;
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }
}
