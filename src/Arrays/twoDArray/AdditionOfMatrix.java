package Arrays.twoDArray;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void printMatrix(int[][] mat){
        for(int[] eleArr : mat){
            for(int ele : eleArr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static void matrixAddition(int[][] matA,int[][] matB){
        int[][] ans = new int[matA.length][matA[0].length];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                ans[i][j] = matA[i][j] + matB[i][j];
            }
        }
        System.out.println("The Addition of the matrix is:");
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

//        if(c1 != r2){
//            System.out.println("Matrix Multiplication of Matrix A and Matrix B is not possible");
//            System.exit(0);
//        }
        if(r1 != r2 || c1 != c2){
            System.out.println("The addition of matrix is not possible");
            System.exit(0);
        }

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

        matrixAddition(matA,matB);
    }
}
