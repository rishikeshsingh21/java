package BasicsOfJava;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 7373;
        int copyNum = num;
        int rev = 0;
        while (copyNum > 0){
            int ld = copyNum % 10;
            copyNum /= 10;
            rev = rev*10 + ld;
        }
        System.out.println("The reverse of the digit is:"+rev);
    }
}
