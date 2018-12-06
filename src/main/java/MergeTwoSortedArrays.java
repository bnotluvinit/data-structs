public class MergeTwoSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int index_arr1 = 0,
                index_arr2 = 0,
                index_result = 0;

        while (index_arr1 < arr1.length && index_arr2 < arr2.length) {

            if (arr1[index_arr1] < arr2[index_arr2]) {

                result[index_result++] = arr1[index_arr1++];
            } else result[index_result++] = arr2[index_arr2++];
        }

        while (index_arr1 < arr1.length) {
            result[index_result++] = arr1[index_arr1++];
        }

        while (index_arr2 < arr2.length) {
            result[index_result++] = arr2[index_arr2++];
        }

        return result;


    }
}
