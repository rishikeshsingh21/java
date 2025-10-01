package Arrays;

public class ReverseArrayInPlace {
    public static void  swap(int[] arr,int i, int j){
        //System.out.println(i+" "+j);
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    public static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println("The Reversed Array:");
        ReverseAnArrayWithNewArray.printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("The original Array:");
        ReverseAnArrayWithNewArray.printArray(arr);
        reverseArray(arr);
    }
}
