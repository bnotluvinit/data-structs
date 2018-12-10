package Arrays;

import Arrays.Find2ndMaxArray;
import org.junit.Assert;
import org.junit.Test;

public class Find2ndMaxArrayTest {
    @Test
    public void find2ndMaxArrayTest() {
        int [] arr = {4,2,1,5,0};
        int result = Find2ndMaxArray.find2ndMax(arr);

        Assert.assertEquals(4, result);
    }
}
