package Arrays.oneDArray;

public class ReverseAnArrayWithNewArray {
    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void reverseArray(int[] arr){
        int[] newArr = new int[arr.length];
        int idx = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[idx--];

        }
        System.out.println("The Original Array");
        printArray(arr);
        System.out.println("The Reverse Array:");
        printArray(newArr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverseArray(arr);
    }

}
