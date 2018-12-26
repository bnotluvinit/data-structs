package Misc;

import org.junit.Assert;
import org.junit.Test;

import static Misc.HasUniqueCharacters.hasUnique;

public class HasUniqueCharactersTest {
    @Test
    public void doesntHaveUniqueCharacters() {
        String word  = "mettle";
        Assert.assertFalse(hasUnique(word));
    }

    @Test
    public void hasUniqueCharacters() {
        String word = "dog";
        Assert.assertTrue(hasUnique(word));
    }
}
