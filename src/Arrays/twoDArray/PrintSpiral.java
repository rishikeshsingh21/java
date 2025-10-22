package Arrays.twoDArray;

public class PrintSpiral {
    static void printSpiralOrder(int[][] mat){
        int top = 0;
        int bottom = mat.length -1;
        int left = 0;
        int right = mat[0].length-1;

        int ele = 0;
        int r = mat.length;
        int c = mat[0].length;
        while (ele < r * c ){
            //print Top Row
            for (int i = left; i <= right && ele < r * c ; i++) {
                System.out.print(mat[top][i]+" ");
                ele++;
            }
            top++;

            //print right row
            for (int i = top; i <= bottom && ele < r * c; i++) {
                System.out.print(mat[i][right]+" ");
                ele++;
            }
            right--;

            //print bottom row
            for (int i = right; i >= left && ele < r * c ; i--) {
                System.out.print(mat[bottom][i]+" ");
                ele++;
            }
            bottom--;
            //print left row
            for (int i = bottom; i >= top && ele < r * c ; i--) {
                System.out.print(mat[i][left]+" ");
                ele++;
            }
            left++;
        }


    }
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        printSpiralOrder(mat);

    }
}
