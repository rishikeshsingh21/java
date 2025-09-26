package BasicsOfJava;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int val = 1;
        for (int i = 0; i < b; i++) {
            val *= a;
        }
        System.out.println(val);
        System.out.println((int)Math.pow(a,b));

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        String q = sc.next();
        System.out.print(p);
        System.out.print(q);
    }
}
