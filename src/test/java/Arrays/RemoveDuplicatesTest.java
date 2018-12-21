package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {
    @Test
    public void removeDuplicatesTest() {

        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        int[] result = {1, 0, 2, 0, 3, 4, 5};

        int [] value = RemoveDuplicates.removeDuplicates(arr);

        Assert.assertArrayEquals(result, value);
    }
}
