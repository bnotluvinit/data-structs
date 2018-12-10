package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RemoveEvenIntegersTest {

    @Test
    public void removeEvenIntegers() {

        int[] arr = {1,2,4,5,10,6,3};

        int[] result = CheckRemoveEven.removeEven(arr);
        int[] arr2 = {1,5,3};

        Assert.assertArrayEquals(result, arr2);

    }
}
