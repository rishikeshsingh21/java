package BasicsOfJava;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number:");
        int deci = sc.nextInt();
        int bin = 0;
        int pw = 1;
        while(deci > 0){
            int parity = deci%2;
            deci /= 2;
            bin += parity*pw;
            pw *= 10;
        }
        System.out.println(bin);
    }
}
