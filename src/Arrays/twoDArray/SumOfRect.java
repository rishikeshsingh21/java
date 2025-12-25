package Arrays.twoDArray;

public class SumOfRect {
    static void printArray(int[][] arr){
        for(int[] subArr : arr){
            for(int ele : subArr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    static void prefixsumCol(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[j][i] += arr[j-1][i];
            }
        }
        printArray(arr);
    }

    static void prefixSum(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
        printArray(arr);
    }
    static void findSumUsingPrefixSum(int[][] arr,int x1,int y1,int x2,int y2){
        prefixSum(arr);
        prefixsumCol(arr);
        int sum = 0;
        if(y1 != 0){
            for (int i = x1; i <= x2; i++) {
                sum += arr[i][y2]-arr[i][y1-1];
            }
            return;
        }
        for (int i = x1; i <= x2; i++) {
            sum += arr[i][y2];
        }

        System.out.println("The sum is "+sum);
    }
    static void findSum(int[][] arr,int x1,int y1, int x2, int y2){
        int sum = 0;
        for (int i = x1; i <= x2 ; i++) {
            for (int j = y1; j <= y2 ; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum is "+ sum);
    }
    static void findSumColPrifix(int[][] arr){

    }

    public static void main(String[] args) {
//        //int[][] array = {
//                {1, 2, 3, 4, 5, 6, 7, 8},
//                {9, 10, 11, 12, 13, 14, 15, 16},
//                {17, 18, 19, 20, 21, 22, 23, 24},
//                {25, 26, 27, 28, 29, 30, 31, 32},
//                {33, 34, 35, 36, 37, 38, 39, 40},
//                {41, 42, 43, 44, 45, 46, 47, 48},
//                {49, 50, 51, 52, 53, 54, 55, 56}
//        };

        int[][] array = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };


        //prefixSum(array);
        //findSum(array,0,0,0,7);
        //findSumUsingPrefixSum(array,0,0,6,7);
        findSumColPrifix(array);


    }
}
