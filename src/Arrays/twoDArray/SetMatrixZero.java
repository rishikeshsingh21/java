package Arrays.twoDArray;

public class SetMatrixZero {
    static void printArray(int[][] arr){
        for(int[] subArr : arr){
            for(int ele : subArr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    static void markRow(int[][] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == key && arr[i][j] != 0){
                    arr[i][j] = -1;
                }
            }
        }
    }
    static void markCol(int[][] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == key && arr[i][j] != 0){
                    arr[i][j] = -1;
                }
            }
        }
    }
    static void setNeg(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              if(array[i][j] == 0){
                markRow(array,i);
                markCol(array,j);
              }
            }
        }
    }
    static void setZeros(int[][] arr){
        setNeg(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1,1},
                {1,0,1,0},
                {1,1,1,1}
        };

        printArray(arr);
        setZeros(arr);
        System.out.println("After seting matrix Zeros");
        printArray(arr);
    }
}
