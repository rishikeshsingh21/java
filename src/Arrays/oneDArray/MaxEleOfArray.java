package Arrays.oneDArray;

public class MaxEleOfArray {
    public static void main(String[] args) {
        int arr[] = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("The max ele:"+max);
    }
}
