package BasicsOfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Rishikesh how are you!!");
        int x = 42;
        double y = 3.14159;
        String name = "Rishikesh";

        System.out.printf("%1$-10s %2$+08d %3$,.2f%n", name, x, y);

        //System.out.println(args[0]); accessing the command line args form the java Basic Rishi

        //java literals
        int bin = 0b101;
        System.out.println(bin);
        int spc = 1_00_000;
        System.out.println(spc);
        int hex = 0xf;
        System.out.println(hex);

        char A = 'A';
        for (int i = 0; i < 10; i++) {
            System.out.println("ASCII : "+((int)A) + " Char :"+ A);
            A++;
        }

        System.out.println("Reading is start");
//        try {
//            //reads only the first character of the input stream
//            //And gives the ascii value 0 - 48 A - 65 a - 97
//            //int nums = System.in.read();
//            //System.out.println(nums);
//
//            //System.in.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Reads the whole input stream of the input stream
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            String str = bf.readLine();
            System.out.println(str);
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);

    }
}
