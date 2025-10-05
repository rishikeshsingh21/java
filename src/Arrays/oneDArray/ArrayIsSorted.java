package Arrays.oneDArray;

public class ArrayIsSorted {
    public static int isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1]<arr[i]) return -1;
        }
        return 1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,34,2,4,24,24,23,243,24,5,34,54,654,334,234,4323,23,23,23,345,454,4,3};
        int res = isSorted(arr);
        //Arrays.sort(arr);
        //res = isSorted(arr);
        if(res > 0) {
            System.out.println("The Given Array is sorted");
        }else{
            System.out.println("The Given array is not sorted");
        }
    }
}
