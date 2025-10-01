package Arrays;

import java.util.Scanner;

public class ForQQuriesFindEleInArray {
    public static int[] createFreqArray(int[] arr){
        int[] freqArray = new int[(int)Math.pow(10,5)];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i]]++;
        }
        return freqArray;
    }
    public static void findEle(int[] arr,int ele){
        int[] freqArray = createFreqArray(arr);

        if(freqArray[ele] > 0) {
            System.out.println("The Element is present in the array");
        }else{
            System.out.println("The Element is not present in the array");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the queries");
        int q = sc.nextInt();

        int[] arr = {
                12, 87, 234, 56, 324, 90, 41, 78, 222, 19,
                305, 67, 145, 888, 432, 55, 999, 120, 7, 301,
                245, 63, 812, 459, 276, 510, 93, 681, 37, 142,
                754, 210, 605, 829, 111, 492, 378, 66, 947, 28
        };


        for (int i = 0; i < q; i++) {
            System.out.println("Enter the element to find in the array");
            int ele = sc.nextInt();
             findEle(arr,ele);
        }
    }
}
