package DSA.SortingTechniques;

public class QuickSort {
    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partitionLomute(int[] arr, int i, int j){
        int pivote = arr[j];
        int smlEle = i -1 ;
        for (int k = i; k < j ; k++) {
            if(arr[k] <= pivote){
                smlEle++;
                int temp = arr[k];
                arr[k] = arr[smlEle];
                arr[smlEle] = temp;
            }
        }
        int temp = arr[smlEle + 1];
        arr[smlEle + 1] = arr[j];
        arr[j] = temp;
        return  smlEle+1;
    }
    public static int partition(int[] arr,int i, int j){
        int low = i;
        int pivote = arr[i];
        while(i < j){
            while (i <= j && arr[i] <= pivote) i++;
            while (arr[j] > pivote) j--;
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivote;
        return  j;
    }
    public static void quickSort(int[] arr, int i, int j){
        if(i < j) {
            //int mid = partition(arr, i, j);
            int mid = partitionLomute(arr, i, j);
            quickSort(arr, i, mid - 1);
            quickSort(arr, mid + 1, j);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,15,1,2,9,16,11};

        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
