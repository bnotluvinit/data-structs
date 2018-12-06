class CheckRemoveEven {
    static int[] removeEven(int[] arr) {
        int odd_numbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd_numbers++;
            }
        }
        int[] result = new int[odd_numbers];
        int result_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[result_index++] = arr[i];
            }
        }
        return result;
    }
}
