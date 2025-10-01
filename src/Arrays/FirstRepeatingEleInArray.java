package Arrays;

public class FirstRepeatingEleInArray {
    public static int lastRepeatingValue(int[] arr){
        int lastval = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]) lastval = arr[i];
            }
        }
        if(lastval != 0) return  lastval;
        else return -1;
    }
    public static int repeatingEle(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,6,3,4,6};
        int[] arr2 = {1,2,4,6,7};
        //int res = repeatingEle(arr2);
        int res = lastRepeatingValue(arr);
        if(res < 0){
            System.out.println("There is no repeating value in the array");
        }else{
            System.out.println("The first repeating ele is:"+res);
        }
    }
}
