package com.alexanderpavlovets.app.homework.lesson4expressions;

import com.alexanderpavlovets.app.classwork.lesson4expressions.CircleArea;
import com.alexanderpavlovets.app.classwork.lesson4expressions.IsOdd;
import com.alexanderpavlovets.app.classwork.lesson4expressions.TriangleCheck;

/**
 * Created by olpav on 04/05/2017.
 */
public class MenuOfExpressions {
    public double calculateCircleArea(double radius){
        CircleArea circle = new CircleArea();
        return circle.calculateAreaByGivenRadius(radius);
    }

    public double getBiggerCircleArea(double r1, double r2){
        CircleArea circle = new CircleArea();
        return circle.getBiggerAreaFromTwoGivenRadiuses(r1,r2);
    }

    public boolean checkIfNumberIsOdd(int number){
        IsOdd isOdd = new IsOdd();
        return isOdd.isOdd(number);
    }

    public boolean checkIfThreeNumberCanFormTriangle(int side1, int side2, int side3){
        TriangleCheck triangleCheck = new TriangleCheck();
        return triangleCheck.isTriangle(side1, side2, side3);
    }
}
