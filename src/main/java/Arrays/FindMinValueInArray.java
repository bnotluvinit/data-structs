package Arrays;

class FindMinValueInArray {

    static int findMinValue(int[] arr) {

        int currentMin = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (currentMin > arr[i]) {
                currentMin = arr[i];
            }
        }
        return currentMin;
    }
}
