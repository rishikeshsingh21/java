package BasicsOfJava;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to count the digit:");
        int num = sc.nextInt();
        int copyNum = num;
        int count = 0;

        while (copyNum > 0){
            copyNum /= 10;
            count++;
        }

        System.out.println("Number of digit in "+num+" is:"+count);
    }
}
