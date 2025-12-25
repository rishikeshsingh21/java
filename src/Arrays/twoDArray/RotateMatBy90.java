package Arrays.twoDArray;

public class RotateMatBy90 {
    public static void printMat(int[][] mat){
        for(int[] row : mat){
            for(int ele : row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static void swap(int[] mat,int i,int j){
        mat[i] = mat[i] + mat[j];
        mat[j] = mat[i] - mat[j];
        mat[i] = mat[i] - mat[j];
    }
    public static void reverseRow(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            int start = 0;
            int end = mat[i].length-1;
            while (start < end){
                swap(mat[i],start,end);
                start++;
                end--;
            }
        }
        printMat(mat);
    }
    public static void transpose(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[i].length; j++) {
                mat[i][j] = mat[i][j] + mat[j][i];
                mat[j][i] = mat[i][j] - mat[j][i];
                mat[i][j] = mat[i][j] - mat[j][i];
            }
        }
        //printMat(mat);
        reverseRow(mat);
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printMat(mat);

        System.out.println("The matrix after rotation by 90 deg:");

        transpose(mat);


    }
}
