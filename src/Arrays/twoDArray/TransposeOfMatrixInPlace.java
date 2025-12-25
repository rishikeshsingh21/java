package Arrays.twoDArray;

import static Arrays.twoDArray.MultiplicationOfMatrix.printMatrix;

public class TransposeOfMatrixInPlace {
    static void swap(int[][] arr,int i,int j){
        arr[i][j] = arr[i][j] + arr[j][i];
        arr[j][i] = arr[i][j] - arr[j][i];
        arr[i][j] = arr[i][j] - arr[j][i];
    }
    static void transposeMatrix(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i+1; j < col; j++) {
                swap(mat,i,j);
            }
        }
        printMatrix(mat);
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        transposeMatrix(mat);
    }
}
