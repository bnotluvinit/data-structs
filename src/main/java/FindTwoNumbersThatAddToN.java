import java.util.Arrays;

class FindTwoNumbersThatAddToN {

    static int[] findSum(int[] arr, int value) {

        Arrays.sort(arr);

        int pointer1 = 0;
        int pointer2 = arr.length - 1;
        int[] result = new int[2];
        int sum = 0;

        while (pointer1 != pointer2) {
            sum = arr[pointer1] + arr[pointer2];

            if (sum < value) pointer1++;
            else if (sum > value) pointer2--;
            else {
                result[0] = arr[pointer1];
                result[1] = arr[pointer2];
                return result;
            }
        }
        return arr;
    }
}