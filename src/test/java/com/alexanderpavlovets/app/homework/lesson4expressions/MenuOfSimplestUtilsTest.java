package com.alexanderpavlovets.app.homework.lesson4expressions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olpav on 04/03/2017.
 */
public class MenuOfSimplestUtilsTest {
    MenuOfSimplestUtils menu = new MenuOfSimplestUtils();
    @Test
    public void additionViaMenu(){
        int actRes = menu.add(1,2);
        int expRes = 3;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void subtractionViaMenu(){
        int actRes = menu.subtract(32, 30);
        int expRes = 2;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void multiplicationViaMenu(){
        int actRes = menu.multiply(2,6);
        int expRes = 12;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void divisionViaMenu(){
        double actRes = menu.divide(10,5);
        double expRes = 2;
        Assert.assertEquals(expRes,actRes, 0.01);
    }

    @Test
    public void squareRootViaMenu(){
        double actRes = menu.squareRoot(9);
        double expRes = 3;
        Assert.assertEquals(expRes,actRes, 0.01);
    }

    @Test
    public void maxValueViaMenu(){
        int actRes = menu.maxValue(45,762);
        int expRes = 762;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void minValueViaMenu(){
        int actRes = menu.minValue(45,762);
        int expRes = 45;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void verifyFirstString(){
        String firstString = menu.getAllStringsArray()[0];
        String expRes = "Welcome to the 'Simplest operations' program";
        Assert.assertEquals(expRes,firstString);
    }

    @Test
    public void maxValueViaMenuWithEqualData(){
        Assert.assertEquals(menu.maxValue(4,4), 4);
    }

    @Test
    public void minValueViaMenuWithEqualData(){
        Assert.assertEquals(menu.minValue(4,4), 4);
    }
}
