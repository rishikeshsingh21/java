package Arrays;

public class CountNumGreaterThenEle {
    public static void main(String[] args) {
        int arr[] = {1,3,34,2,4,24,24,23,243,24,5,34,54,654,334,234,4323,23,23,23,345,454,4,3};
        int key = 2300;
        int count = 0;
        for(int ele : arr){
            if(ele > key) count++;
        }

        System.out.println("The Number of element Greater then "+key+" is "+count);
    }
}
