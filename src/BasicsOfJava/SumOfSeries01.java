package BasicsOfJava;

// s = 1-2+3-4+5-6.....n


public class SumOfSeries01 {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i % 2 != 0) ? i : -i;
//            if( i%2 != 0) sum += i;
//            else sum -= i;
        }
        System.out.println(sum);
    }
}
