package DSA.SortingTechniques;

public class MergeSort {
    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    private static void merge(int[] arr, int low, int mid, int high) {
        int l1 = mid - low + 1;
        int l2 = high - mid;
        int[] larr = new int[l1];
        int[] rarr = new int[l2];

        for (int i = 0; i < l1; i++) {
            larr[i] = arr[low+i];
        }

        for (int i = 0; i < l2; i++) {
            rarr[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;

        int k = low;

        while (i < l1 && j < l2){
            if(larr[i] < rarr[j]){
                arr[k] = larr[i++];
            }
            else{
                arr[k] = rarr[j++];
            }
            k++;
        }

        while(i < l1){
            arr[k++] = larr[i++];
        }

        while(j < l2){
            arr[k++] = rarr[j++];
        }

    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {115,5,241,8,3321,3,12216,11012,20};

        mergeSort(arr,0,arr.length-1);
        System.out.println("The Sorted Array After MergeSort:");
        printArr(arr);
    }
}
