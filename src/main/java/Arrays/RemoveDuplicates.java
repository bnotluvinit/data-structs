package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] array){

        Arrays.sort(array);
        int[] result = new int[array.length];
        int previous = array[0];
        result[0] = previous;

        for(int i = 1; i < array.length; i++){
            int index = array[i];

            if(previous != index){
                result[i] = index;
            }
            previous = index;
        }
        return result;
    }
}
