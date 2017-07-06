package com.alexanderpavlovets.app.classwork.lesson8switcharrays;

import java.util.Arrays;

/**
 * Created by olpav on 04/18/2017.
 * It should be covered by tests also !
 */
public class BubbleSort {

    public static void main(String[] args) {

        boolean flag = true;
        int[] a = {28,11,128,56,54,78,98,51,23,654};
        while(flag){
            flag = false;
            for(int i = 0; i<a.length-1; i++){
                if(a[i] > a[i+1]){
                    int b = a[i];
                    a[i] = a[i+1];
                    a[i+1] = b;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
