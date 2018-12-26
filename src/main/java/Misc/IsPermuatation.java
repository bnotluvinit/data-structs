package Misc;

import java.util.Arrays;

public class IsPermuatation {

    public static boolean isPerm(String[][] pair) {

        for (String[] p : pair) {
            String word1 = p[0];
            String word2 = p[1];
            boolean anagram = permuation(word1, word2);
            if(anagram){
                return true;
            }
        }
            return false;
    }

    private static boolean permuation(String word1, String word2) {
        return sort(word1).equals(sort(word2));
    }

    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
