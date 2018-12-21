package Arrays;

import java.util.BitSet;

public class FindMissingNumbersInArray {
    public static int findMissingNumbers(int[] numbers, int count){
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number: numbers) {
            bitSet.set(number -1);
        }
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++){
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            return ++lastMissingIndex;

        }

        return missingCount;
    }
}
