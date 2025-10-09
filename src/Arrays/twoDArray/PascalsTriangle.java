package Arrays.twoDArray;

import java.util.Scanner;

import static Arrays.twoDArray.RotateMatBy90.printMat;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row:");
        int n = sc.nextInt();

        int[][] pascal = new int[n][];

        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i+1];
            for (int j = 0; j < i+1; j++) {
                if(j == 0 || j == pascal[i].length -1){
                    pascal[i][j] = 1;
                }else{
                    pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
                }
            }

        }

        printMat(pascal);

    }
}
