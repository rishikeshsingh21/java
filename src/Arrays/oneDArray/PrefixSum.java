package Arrays.oneDArray;

import static Arrays.oneDArray.SortArray0_1.printArray;

public class PrefixSum {
    static void calPrefixSum(int[] arr){
        int n = arr.length;
        int[] pre = new int[n];

        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i-1] + arr[i];
        }
        printArray(pre);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};

        calPrefixSum(arr);
    }
}
