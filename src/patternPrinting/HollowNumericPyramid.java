package patternPrinting;

public class HollowNumericPyramid {
    public static void main(String[] args) {
        int r = 6;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if(j == 1 || j == (2*i - 1) || i == r)
                    System.out.print(i);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
