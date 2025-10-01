package Arrays;

public class SortArray0_1 {
    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void sortArray(int[] arr,int zeros){
        for (int i = 0; i < arr.length; i++) {
            if( i < zeros){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        printArray(arr);
    }
    public static int countZero(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1,0,0};

        int zeros = countZero(arr);

        sortArray(arr,zeros);

    }
}
