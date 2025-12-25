package Recursion;

public class OneToNNaturalNumber {
    public static void printDecreasing(int n){
        System.out.print(n+" ");
        if(n>1){
            printDecreasing(n-1);
        }
        return;

    }
    public static void printIncreasing(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        printIncreasing(5);
        System.out.println();
        printDecreasing(5);
    }
}
