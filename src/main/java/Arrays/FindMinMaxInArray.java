package Arrays;

public class FindMinMaxInArray {

    public static void main(String args[]){
        largestAndSmallest(new int[] {-20,34,21,-87, 92, Integer.MAX_VALUE});
    }

    private static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int number: numbers) {
            if (number > largest){
                largest = number;
            }else if (number < smallest){
                smallest = number;
            }

        }
        System.out.println("Largest:" + largest);
        System.out.println("Smallest:" + smallest);
    }

}
