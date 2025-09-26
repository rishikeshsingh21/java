package BasicsOfJava;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 292992;
        int copyNum = num;
        int sum = 0;
        while(copyNum>0){
            int ld = copyNum % 10;
            copyNum /= 10;
            sum += ld;
        }
        System.out.println("The sum of the digit in "+num+" is:"+sum);
    }
}
