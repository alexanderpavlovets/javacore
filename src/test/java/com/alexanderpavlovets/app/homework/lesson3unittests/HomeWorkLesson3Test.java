package com.alexanderpavlovets.app.homework.lesson3unittests;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olpav on 02/13/2017.
 */
public class HomeWorkLesson3Test {

    // Addition tests here:
    @Test
    public void additionTest0(){
        int a = 2, b = 2;
        int expRes = 4;
        Assert.assertEquals(expRes, Addition.add(a,b));
    }
    @Test
    public void additionTest1(){
        int a = 3, b = 4;
        int expRes = 7;
        Assert.assertEquals(expRes, Addition.add(a,b));
    }
    @Test
    public void additionTest2(){
        int a = 5, b = 19;
        int expRes = 555;
        Assert.assertNotEquals(expRes, Addition.add(a,b));
    }

    //Subtraction tests here:
    @Test
    public void subtractionTest0(){
        int a = 25, b = 20;
        int expRes = 5;
        Assert.assertEquals(expRes, Subtraction.substract(a,b));
    }
    @Test
    public void subtractionTest1(){
        int a = 20, b = 30;
        int expRes = -10;
        Assert.assertEquals(expRes, Subtraction.substract(a,b));
    }
    @Test
    public void subtractionTest2(){
        int a = 288, b = 288;
        int expRes = 0;
        Assert.assertEquals(expRes, Subtraction.substract(a,b));
    }

    //Multiplication test here:
    @Test
    public void multiplicationTest0(){
        int a = 10, b = 8;
        int expRes = 80;
        Assert.assertEquals(expRes, Multiplication.multiply(a,b));
    }
    @Test
    public void multiplicationTest1(){
        int a = 0, b = 81281;
        int expRes = 0;
        Assert.assertEquals(expRes, Multiplication.multiply(a,b));
    }
    @Test
    public void multiplicationTest2(){
        int a = 4561326, b = 81281;
        int expRes = 111;
        Assert.assertNotEquals(expRes, Multiplication.multiply(a,b));
    }

    //Division test here:
    @Test
    public void divisionTest0(){
        int a = 200, b = 20;
        int expRes = 10;
        Assert.assertEquals(expRes, Division.divide(a,b));
    }
    @Test
    public void divisionTest1(){
        int a = 9, b = 3;
        int expRes = 3;
        Assert.assertEquals(expRes, Division.divide(a,b));
    }
    @Test
    public void divisionTest2(){
        int a = 12345, b = 6789;
        int expRes = 111;
        Assert.assertNotEquals(expRes, Division.divide(a,b));
    }

    //Square root tests here:
    @Test
    public void sqrRootTest0(){
        int a = 9;
        int expRes = 3;
        Assert.assertEquals(expRes, SquareRoot.squareRoot(a), 1);
    }
    @Test
    public void sqrRootTest1(){
        int a = 100;
        int expRes = 10;
        Assert.assertEquals(expRes, SquareRoot.squareRoot(a), 0);
    }
    @Test
    public void sqrRootTest2(){
        double a = 33.2365;
        int expRes = 5;
        Assert.assertEquals(expRes, SquareRoot.squareRoot(a), 0.8);
    }

    //Max value is chosen from 2 given values tests here:
    @Test
    public void maxValueTest0(){
        int a = 6, b = 456;
        int expRes = b;
        Assert.assertEquals(expRes, MaxValueInt.getMaxOfTwoGiven(a,b));
    }
    @Test
    public void maxValueTest1(){
        int a = -456321789, b = 0;
        int expRes = 0;
        Assert.assertEquals(expRes, MaxValueInt.getMaxOfTwoGiven(a,b));
    }
    @Test
    public void maxValueTest2(){
        int a = -800, b = -900;
        int expRes = -800;
        Assert.assertEquals(expRes, MaxValueInt.getMaxOfTwoGiven(a,b));
    }

    //Min value is chosen from 2 given tests here:
    @Test
    public void minValueTest0(){
        int a = - 200, b = -300;
        int expRes = -300;
        Assert.assertEquals(expRes, MinValueInt.getMinOfTwoGiven(a,b));
    }
    @Test
    public void minValueTest1(){
        int a = 8000, b = 8001;
        int expRes = 8000;
        Assert.assertEquals(expRes, MinValueInt.getMinOfTwoGiven(a,b));
    }
    @Test
    public void minValueTest2(){
        int a = 8001, b = 8000;
        int expRes = 8000;
        Assert.assertEquals(expRes, MinValueInt.getMinOfTwoGiven(a,b));
    }

    //Attempt to create test for array (without understanding what is array)
    @Test
    public void formArrayTest(){
        int a = 1, b = 2, c = 3;
        int[] expRes = new int[3];
        expRes[0] = 1;
        expRes[1] = 2;
        expRes[2] = 3;
        Assert.assertArrayEquals(expRes,FormIntArray.formArray(a,b,c));
    }

}


