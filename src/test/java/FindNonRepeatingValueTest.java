import org.junit.Assert;
import org.junit.Test;

public class FindNonRepeatingValueTest {

    @Test
    public void findNonRepeatingValueTest() {

        int[] arr = {9,2,3,2,6,6};
        int result = FindNonRepeatingValue.findNonRepeating(arr);

        Assert.assertEquals(9, result);

    }
}
