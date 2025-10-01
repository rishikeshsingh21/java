package Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int sum = 7;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length-1; j++) {
                if(arr[i]+arr[j] == sum) count++;
            }
        }
        System.out.println("The Number of Pairs:"+count);
    }
}
