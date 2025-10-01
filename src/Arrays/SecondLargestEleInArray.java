package Arrays;

public class SecondLargestEleInArray {
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    static int secondMax(int[] arr){
        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max) arr[i] = Integer.MIN_VALUE;
        }

        return findMax(arr);
    }
    public static void main(String[] args) {
        int[] arr = {9,8,9,6,9,5,8};
        int[] arr2 = {0,-2,0,-3,0,-4};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
        System.out.println(secondMax(arr));
        System.out.println(secondMax(arr2));
    }
}
