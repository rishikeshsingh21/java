package DSA.SortingTechniques;

import static DSA.SortingTechniques.BubbleSort.printArr;

public class Sorting {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) min = j;
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivote = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(i <= j && arr[i] <= pivote) i++;
            while(arr[j] > pivote) j--;
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
    public static int partitionLumote(int[] arr, int low, int high){
        int pivote = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivote){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[high] = arr[i+1];
        arr[i+1] = pivote;
        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            //int pivoteIdx = partition(arr,low,high);
            int pivoteIdx = partitionLumote(arr, low, high);
            quickSort(arr,low,pivoteIdx-1);
            quickSort(arr,pivoteIdx+1,high);

        }
    }
    public static void combine(int[] arr, int low, int mid, int high){
        int l1 = mid - low + 1;
        int l2 = high - mid;

        int[] lArr = new int[l1];
        int[] rArr = new int[l2];

        for(int i = 0; i < l1; i++){
            lArr[i] = arr[low+i];
        }
        for(int i = 0; i < l2; i++){
            rArr[i] = arr[mid+1+i];
        }

        int i = 0;
        int j = 0;
        int k = low;



        while (i < l1 && j < l2){
            if(lArr[i] < rArr[j]){
                arr[k] = lArr[i++];
            }else {
                arr[k] = rArr[j++];
            }
            k++;
        }

        while (i < l1) {
            arr[k++] = lArr[i++];
        }

        while (j < l2) {
            arr[k++] = rArr[j++];
        }

    }
    public static void combineTwo(int[] arr, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];
        while (i <= mid && j <= high){
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }
        for(int l = 0; l < temp.length;l++){
            arr[low + l] = temp[l];
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high) /2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1, high);
            //combine(arr,low,mid,high);
            combineTwo(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,23,4,354,2,77,5,242,42,99,535,3,35,6,75,3};

        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //quickSort(arr,0,arr.length -1);

        mergeSort(arr,0,arr.length - 1);
        printArr(arr);
    }
}
