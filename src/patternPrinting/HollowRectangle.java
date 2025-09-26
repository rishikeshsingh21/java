package patternPrinting;

public class HollowRectangle {
    public static void main(String[] args) {
        int row = 8;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row*2; j++) {
                if(i == 0 || i == row-1 || j == 0 || j == row*2 -1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
