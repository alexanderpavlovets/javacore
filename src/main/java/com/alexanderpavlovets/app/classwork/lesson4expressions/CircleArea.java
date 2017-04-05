package com.alexanderpavlovets.app.classwork.lesson4expressions;

/**
 * Created by olpav on 02/14/2017.
 * This runner is rewritten by me, that's why it is moved to homework package
 */
public class CircleArea {
    public static final double PI = 3.14;


    // Continue from here !!! Rewrite this shit to be valuable

    public double calculateAreaByGivenRadius(double radius) {
        double circleArea = PI * (radius * radius);
        System.out.println("Your entered circle radius is " + radius);
        System.out.println("Your circle area is " + circleArea);
        return circleArea;
    }

    public double getBiggerAreaFromTwoGivenRadiuses(double r1, double r2) {
        double area1 = this.calculateAreaByGivenRadius(r1);
        double area2 = this.calculateAreaByGivenRadius(r2);

        if (area1 > area2) {
            System.out.println("Area 1 is bigger, and it is equal to " + area1);
            return area1;
        } else if (area1 == area2) {
            System.out.println("Entered radiuses are equal, both areas areas is equal to " + area1);
            return area1;
        } else {
            System.out.println("Area 2 is bigger, and it is equal to " + area2);
            return area2;
        }
    }
}
