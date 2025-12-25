package Arrays.twoDArray;

import static Arrays.twoDArray.MultiplicationOfMatrix.printMatrix;

public class TransposeOfMatrix {
    static void transposeOfMatrix(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;

        int[][] transMat = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transMat[i][j] = mat[j][i];
            }
        }
        printMatrix(transMat);
    }
    public static void main(String[] args) {
        //Transpose of the matrix
        int[][] mat = {{1,2,3},{4,5,6}};

        transposeOfMatrix(mat);
    }
}
