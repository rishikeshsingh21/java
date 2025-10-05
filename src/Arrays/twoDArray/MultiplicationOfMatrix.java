package Arrays.twoDArray;

import java.util.Scanner;

public class MultiplicationOfMatrix {
    public static void printMatrix(int[][] mat){
        for(int[] eleArr : mat){
            for(int ele : eleArr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static void matrixMultiplication(int[][] matA,int[][] matB,int r1,int c1,int r2,int c2){
       int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        printMatrix(ans);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("For Matrix A");
        System.out.println("Enter the size of matrix A: r1*c1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("For Matrix B");
        System.out.println("Enter the size of Matrix B: r2*c2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(c1 != r2){
            System.out.println("Matrix Multiplication of Matrix A and Matrix B is not possible");
            System.exit(0);
        }
//        if(r1 != r2 || c1 != c2){
//            System.out.println("The addition of matrix is not possible");
//            System.exit(0);
//        }

        System.out.println("Enter the Element of Matrix A:"+ r1+" * "+c1);
        int[][] matA = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matA[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the Element of Matrix A:"+ r1+" * "+c1);
        int[][] matB = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matB[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        matrixMultiplication(matA,matB,r1,c1,r2,c2);
    }
}
