package DSA.SortingTechniques;

public class BubbleSort {
    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {83,3,42,323,233,24,234,24,35,4,35,2,4,242,2,143,435,353,242};

        bubbleSort(arr);
        printArr(arr);
    }
}
