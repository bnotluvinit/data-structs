import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindTwoNumbersThatAddupToN {

    @Test
    public void findTwoNumbersThatAddToN() {
        int[] arr = {1,21,3,14,5,60,7,6};
        int value = 61;

        int []result = FindTwoNumbersThatAddToN.findSum(arr, value);

        int total = result[0] + result[1];

        Assert.assertEquals(value, total);
        System.out.println(Arrays.toString(result));
    }
}
