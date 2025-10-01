package Arrays;

public class SmallestAndSecondSamallestEle {
    public static int smallesEle(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int secondSmallestEle(int[] arr){
        int min = smallesEle(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min) arr[i] = Integer.MAX_VALUE;
        }
        return smallesEle(arr);

    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1, 3};
        System.out.println(smallesEle(arr));
        System.out.println(secondSmallestEle(arr));
    }
}
