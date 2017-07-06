package com.alexanderpavlovets.app.classwork.lesson10strings;

/**
 * Created by olpav on 05/11/2017.
 */
public class IsPoligram {
    public boolean isPoligram(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str.toLowerCase());
    };

    public static void nameMine(){
        
    };
}
