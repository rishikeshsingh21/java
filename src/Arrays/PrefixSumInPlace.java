package Arrays;

import static Arrays.SortArray0_1.printArray;

public class PrefixSumInPlace {
    static void findPrefixInPlace(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i]+arr[i-1];
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        findPrefixInPlace(arr);
    }
}
