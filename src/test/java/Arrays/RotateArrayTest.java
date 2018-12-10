package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
    @Test
    public void rotateArrayTest() {
        int [] arr = {1,2,3,4,5};


        RotateArray.rotateArray(arr);
        int [] resultArr = {5,1,2,3,4};
        Assert.assertArrayEquals(resultArr, arr);

    }
}
