package BasicsOfJava;

public class SwapValTemp {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a - "+a+"  b - "+b);
    }
    public static void main(String[] args) {
        int a = 55;
        int b = 33;

        swap(a,b);  ///primitive value pass by value
        System.out.println("The original value a - "+a+"  b - "+b);
//        int temp = a;
//        a = b;
//        b = temp;

//        Method 2;
//        a = a + b;
//        b = a - b;
//        a = a - b;

//        Method 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a - "+a+"  b - "+b);
    }
}
