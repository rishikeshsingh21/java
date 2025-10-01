package Arrays;

import static Arrays.SortArray0_1.printArray;

public class SquareOfEachEleNonDecArray {
    public static void sortArrayAndSquare(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int idx = arr.length - 1;
        int[] ans = new int[arr.length];

        while(i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[idx] = arr[i] * arr[i];
                i++;
            }else{
                ans[idx] = arr[j] * arr[j];
                j--;
            }
            idx--;
        }
        System.out.println("The sorted array");
        printArray(ans);
    }
    public static void main(String[] args) {
        int[] arr = {-10,-3,-2,1,4,5};

        sortArrayAndSquare(arr);
    }
}
