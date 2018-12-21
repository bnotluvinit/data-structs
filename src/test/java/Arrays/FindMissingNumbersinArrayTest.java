package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumbersinArrayTest {
    @Test
    public void findMissingNumbersInArrayTest() {

        int[] arr = {1,3,4,5,6};
        int count = 6;
        int value = FindMissingNumbersInArray.findMissingNumbers(arr, count);
        Assert.assertEquals(2, value);
    }
}
