package com.alexanderpavlovets.runners.classwork.lesson10strings;

/**
 * Created by olpav on 05/11/2017.
 */
public class MeasureOfPerformanceWithStrings {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++){
            c = c.concat(b);
        }
        long  end = System.currentTimeMillis();
        System.out.println(end - start);

        // The same code with String builder - here should be faster
        long start1 = System.currentTimeMillis();
        StringBuilder x = new StringBuilder("start");
        String y = "finish";
        for(long i = 0; i < 100000; i++){
            x = x.append(y);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }

    // output here is 7428 and 4 - feel the difference.
}
