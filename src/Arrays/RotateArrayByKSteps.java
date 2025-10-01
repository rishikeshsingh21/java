package Arrays;

import java.util.Scanner;

public class RotateArrayByKSteps {
    public static void swap(int[] arr,int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    public static void reverseArray(int[] arr,int i,int j){
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void rotateArrayByKSteps(int[] arr,int k){

        int i = 0;
        int j = arr.length-1;

        if(k == 0){
            System.out.println("The rotated array is:");
            ReverseAnArrayWithNewArray.printArray(arr);
        }else{
            reverseArray(arr,i,j);
            ReverseAnArrayWithNewArray.printArray(arr);
            reverseArray(arr,i,k-1);
            ReverseAnArrayWithNewArray.printArray(arr);
            reverseArray(arr,k,j);

            System.out.println("The rotated array:");
            ReverseAnArrayWithNewArray.printArray(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        //System.out.println(arr.length);
        System.out.print("Enter the Steps to rotate: ");
        int k = sc.nextInt();
        k = k%arr.length;
        System.out.println(k);

        rotateArrayByKSteps(arr,k);

    }
}
