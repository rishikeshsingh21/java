package Arrays.oneDArray;

import java.util.Scanner;

public class PrefixSumForRangeForQQueries {

    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static int[] prefixArray(int[] arr){
        int[] prefixArr = new int[arr.length];

        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i-1]+arr[i];
        }

        return prefixArr;
    }
    static int findPrefix(int[] arr,int i, int j){
       int[] prefixArray = prefixArray(arr);
       System.out.println("The prefix Array:");
       printArray(prefixArray);

       if(i > 0) return prefixArray[j]- prefixArray[i-1];
       else return prefixArray[j];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the arrays:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The entered Array :");
        printArray(arr);

        System.out.println("Enter the number of Queries:");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("Enter the range[included]");
            int i = sc.nextInt();
            int j = sc.nextInt();
            int ans = findPrefix(arr,i,j);
            System.out.println("The sum is:"+ans);
            q--;
        }

    }
}
