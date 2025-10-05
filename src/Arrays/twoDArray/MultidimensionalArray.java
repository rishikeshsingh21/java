package Arrays.twoDArray;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[][] arr2 = {
                {2,3,4,3,3,3},
                {3,3,45,354,234,34},
                {34,24,24,34,2,4,4}
        };

        for(int[] eleArr : arr2){
            for(int ele : eleArr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
