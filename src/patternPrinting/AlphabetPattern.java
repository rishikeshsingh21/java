package patternPrinting;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.next();

        int strLen = str.length();

        //First half row
        for (int i = 0; i < strLen; i++) {
            System.out.print(str.charAt(i));
        }
        //first reverse
        for(int i = strLen-2; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //the bridge
        for (int i = 0; i < strLen-1; i++) {
            //first triangle
            for (int j = 0; j < strLen-1 - i; j++) {
                System.out.print(str.charAt(j));
            }
            //pyramid space
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(" ");
            }
            //reverse triangle
            for(int j = strLen-2-i; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

    }
}
