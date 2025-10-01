package Arrays;

public class TargetTripletSum {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int sum = 12;
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == sum) count++;
                }
            }
        }
        System.out.println("Number of triplet target sum set is:" + count);
    }
}
