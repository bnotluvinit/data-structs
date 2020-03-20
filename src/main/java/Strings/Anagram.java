package Strings;


import java.util.Arrays;

    class Anagram {
    static Boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] array1 = word.toCharArray();
        char[] array2 = anagram.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}

