package com.alexanderpavlovets.app.homework.lesson9string;

/**
 * Created by olpav on 07/10/2017.
 */
public class IsPalindrome {
    public static boolean isPalindromeFirst(String userInput){
        String reverse = "";
        for(int i = userInput.length() -1; i >= 0; i--){
            reverse = reverse + userInput.charAt(i);
        }
        if(userInput.equals(reverse)){
            return true;
        }
        else{return false;}
    }

    public static boolean isPalindromeSecond(String userInput){ //as in presentation
        boolean isPalindrome = true;
        for(int i = 0; i < userInput.length()/2; i++){
            isPalindrome = isPalindrome && (userInput.charAt(i) == userInput.charAt(userInput.length()-i-1));
        }

        return isPalindrome;
    }

    public static boolean isPalindromeThird(String userInput){

        char[] userInputAsArray = userInput.toCharArray();
        int firstLetterIndex = 0;
        int lastLetterIndex = userInputAsArray.length - 1;

        while(lastLetterIndex > firstLetterIndex){
            if(userInputAsArray[firstLetterIndex] != userInputAsArray[lastLetterIndex]){
                return false;
            }
            firstLetterIndex ++;
            lastLetterIndex --;
        }
        return true;
    }
}
