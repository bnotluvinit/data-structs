import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedArraysTest {
    @Test
    public void mergeTwoSortedArraysTest() {
        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,6,7,8};

        int[] result = {1,2,3,4,5,6,7,8};

        int[] actual = MergeTwoSortedArrays.mergeArrays(arr1, arr2);

        Assert.assertArrayEquals(result, actual);

    }
}
