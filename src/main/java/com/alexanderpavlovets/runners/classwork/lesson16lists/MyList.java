package com.alexanderpavlovets.runners.classwork.lesson16lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by olpav on 06/27/2017.
 */
public class MyList {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter a value");
//
//        String input = scanner.next().toString();
//
//        myList.add(input);
//
//        System.out.println(myList.get(0));

        while(true){
            System.out.println("Please enter a value");
            String input = scanner.next().toString();
            if(!input.equals("stop")){
                myList.add(input);
            }
            else{
                for(String i : myList){
                    // if values are the same - index will be the same !
                    // make a usual for - and will work 
                    System.out.println(i + myList.indexOf(i));
                }
                break;
            }
        }

    }
}
