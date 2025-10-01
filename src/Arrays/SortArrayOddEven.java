package Arrays;

import static Arrays.SortArray0_1.printArray;
import static Arrays.SortArray0_1TwoPointer.swap;

public class SortArrayOddEven {
    public static void sortArrayOddEven(int[] arr){
        int i = 0;
        int j = arr.length -1;

        while(i < j){
            if(arr[i] % 2 != 0 && arr[j] % 2 == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] % 2 == 0 ) i++;
            if(arr[j] % 2 != 0 ) j--;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = {11,12,13,24,25,26,27};
        System.out.println("The sorted array is:");
        sortArrayOddEven(arr);
    }
}
