class FindProductArray {
    static int[] findProduct(int[] arr) {

        int[] result = new int[arr.length];
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            int currentproduct = 1;

            for (int j = i + 1; j < arr.length; j++) {
                currentproduct = currentproduct * arr[j];
            }
            result[i] = currentproduct * product;
            product = product * arr[i];

        }
        return result;
    }


}
