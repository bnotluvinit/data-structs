package Strings;

public class ReverseString {

    public static String reverseString(String word){
        if(word.length() < 2){
            return word;
        }else
            return reverseString(word.substring(1)) + word.charAt(0);
    }
}
