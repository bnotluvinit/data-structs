package Arrays;

import Arrays.FindProductArray;
import org.junit.Assert;
import org.junit.Test;

public class FindProductArrayTest {

    @Test
    public void findProductArray() {
        int[] arr = {1,2,3,4};

        int[] resultArr = FindProductArray.findProduct(arr);

        int[] productArr = {24,12,8,6};

        Assert.assertArrayEquals(resultArr, productArr);
    }
}
