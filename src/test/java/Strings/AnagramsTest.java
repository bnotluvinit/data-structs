package Strings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramsTest {
    @Test
    public void anagrams() {
        String word = "abcdcba";
        String anagram = "abcdcba";
        Assert.assertTrue(Anagram.isAnagram(word, anagram));
    }
}
