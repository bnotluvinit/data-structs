package Misc;

public class OneEditAway {
    public static boolean oneEditAway(String word1, String word2) {

        boolean result = oneEdit(word1, word2);
        return result;
    }

    private static boolean oneEdit(String word1, String word2) {
        if (word1.length() == word2.length()) {
            return oneEditReplace(word1, word2);
        } else if (word1.length() + 1 == word2.length()) {
            return oneEditInsert(word1, word2);
        } else if (word1.length() - 1 == word2.length()) {
            return oneEditInsert(word1, word2);
        }
        return false;

    }

    private static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }

                foundDifference = true;
            }
        }
        return true;
    }


}