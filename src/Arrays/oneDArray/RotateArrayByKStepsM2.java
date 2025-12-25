package Arrays.oneDArray;

public class RotateArrayByKStepsM2 {
    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void rotateArray(int[] arr,int k){
        int n = arr.length;
        int[] ansArray = new int[n];
        int j = 0;
        for (int i = n-k; i < n ; i++) {
            ansArray[j++] = arr[i];
        }
        for (int i = 0; i < n-k ; i++) {
            ansArray[j++] = arr[i];
        }
        System.out.println("The rotated array is:");

        printArray(ansArray);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 67;

        rotateArray(arr,k%arr.length);

    }
}
