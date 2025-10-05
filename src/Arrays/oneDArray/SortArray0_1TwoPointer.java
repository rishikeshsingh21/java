package Arrays.oneDArray;

import static Arrays.oneDArray.SortArray0_1.printArray;

public class SortArray0_1TwoPointer {
    public static void swap(int[] arr,int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    public static void sortArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }

        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1,0,0};

        sortArray(arr);

    }
}
