package Arrays;

public class Find2ndMaxArray {
    static int find2ndMax(int[] arr){

        int max = 0;
        int secondmax = 0;

        for (int i=0; i < arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }else if (arr[i] > secondmax){
                secondmax = arr[i];
            }
        }
        return secondmax;
    }

}
