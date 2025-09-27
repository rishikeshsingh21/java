package Arrays;
import  java.util.Arrays;
class SearchEle{
    public int searchElement(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }
}
public class SearchingEleInArray {
    public static void printArray(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12,56,223,32,5432,234,2,43,35,23,64,345,3,435,43,43,345,65,56,67,78,87,86,};
        int key = 56;
        SearchEle obj = new SearchEle();
        int result = obj.searchElement(arr,key);
        if(result > 0){
            System.out.println("The element is fount at index:"+result);
        }else{
            System.out.println("The element is not present in the array");
        }
        printArray(arr);

        int arr2[] = arr.clone();

        printArray(arr2);
        Arrays.sort(arr2);
        printArray(arr2);


    }
}
