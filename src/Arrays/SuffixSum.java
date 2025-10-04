package Arrays;

import java.util.Scanner;

public class SuffixSum {
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static void findSuffixSum(int[] arr){
        for (int i = arr.length - 1; i > 0 ; i--) {
            arr[i-1] = arr[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        findSuffixSum(arr);
        System.out.println("The Suffix Sum Array");
        printArray(arr);
    }
}
