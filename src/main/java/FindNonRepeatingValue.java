public class FindNonRepeatingValue {
    static int findNonRepeating(int[] arr) {

        boolean isRepeated = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                }
            } //end of InnerLoop

            if (isRepeated == false) {
                return arr[i];
            }
            isRepeated = false;

        } //end of OuterLoop
        return -1;
    } //end of findFirstUnique
}
