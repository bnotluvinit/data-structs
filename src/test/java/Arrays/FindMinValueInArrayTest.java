package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindMinValueInArrayTest {
    @Test
    public void findMinValueInArrayTest() {
        int[] arr = {9,2,3,6,1};

        int result = FindMinValueInArray.findMinValue(arr);

        Assert.assertEquals(1, result);
    }
}
