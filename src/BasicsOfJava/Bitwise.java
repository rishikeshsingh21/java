package BasicsOfJava;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println(9|10);
        System.out.println(9&10);
        int a = 10;
        int b = 9;
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a+":"+ b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+":"+b);
    }
}
