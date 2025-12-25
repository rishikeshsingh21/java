package BasicsOfJava;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        int bin = sc.nextInt();
        int deci = 0;
        int i = 0;
        while (bin > 0){
            int ld = bin%10;
            bin /= 10;
            deci += ld*Math.pow(2,i);
            i++;
        }
        System.out.println(deci);
    }
}
