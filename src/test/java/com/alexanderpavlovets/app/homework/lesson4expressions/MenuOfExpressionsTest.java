package com.alexanderpavlovets.app.homework.lesson4expressions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olpav on 04/07/2017.
 * This test is testing menu of expressions, but menu just calls to the Classes CircleArea, IsOdd, TriagleCheck
 * So, this test is testing both - menu and classes.
 */
public class MenuOfExpressionsTest {
    MenuOfExpressions menu  = new MenuOfExpressions();

    @Test
    public void calculateCircleAreaViaMenu(){
        double expRes = 12.56d;
        double actRes = menu.calculateCircleArea(2);
        Assert.assertEquals(expRes,actRes, 0.001);
    }

    @Test
    public void getBiggerAreaSecondIsBigger(){
        double radius1 = 12d;
        double radius2 = 14d;
        double expRes = 615.44;
        double actRes = menu.getBiggerCircleArea(radius1,radius2);
        Assert.assertEquals(expRes,actRes, 0.001);
    }

    @Test
    public void getBiggerAreaFirstIsBigger(){
        double radius1 = 14d;
        double radius2 = 12d;
        double expRes = 615.44;
        double actRes = menu.getBiggerCircleArea(radius1,radius2);
        Assert.assertEquals(expRes,actRes, 0.001);
    }

    @Test
    public void getBiggerAreaEqualAreas(){
        double radius1 = 14d;
        double radius2 = 14d;
        double expRes = 615.44;
        double actRes = menu.getBiggerCircleArea(radius1,radius2);
        Assert.assertEquals(expRes,actRes, 0.001);
    }

    @Test
    public void checkIsGivenNumberIsOdd(){
        int number = 2;
        Assert.assertTrue(menu.checkIfNumberIsOdd(number));
    }

    @Test
    public void checkIsGivenNumberIsEven(){
        int number =3;
        Assert.assertFalse(menu.checkIfNumberIsOdd(number));
    }

    @Test
    public  void threeSidesCanFormTriangle(){
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        Assert.assertTrue(menu.checkIfThreeNumberCanFormTriangle(side1,side2,side3));
    }

    @Test
    public  void threeSidesCanNotFormTriangle(){
        int side1 = 1;
        int side2 = 4;
        int side3 = 5;
        Assert.assertFalse(menu.checkIfThreeNumberCanFormTriangle(side1,side2,side3));
    }

    @Test
    public void threeSidesCanNotFormTriangleOneIsZero(){
        int side1 = 0;
        int side2 = 4;
        int side3 = 5;
        Assert.assertFalse(menu.checkIfThreeNumberCanFormTriangle(side1,side2,side3));
    }


}
