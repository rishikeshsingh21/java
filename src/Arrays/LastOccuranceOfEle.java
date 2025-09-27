package Arrays;

public class LastOccuranceOfEle {
    public static void main(String[] args) {
        int arr[] = {1,3,34,2,4,24,24,23,243,24,5,34,54,654,334,234,4323,23,23,23,345,454,4,3};
        int ele = 55;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele) idx = i;
        }
        System.out.println("The last Occurance of ele "+ele+" is "+idx);
    }
}
