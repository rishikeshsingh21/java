package DSA.SortingTechniques;

public class LinearSearch {
    public static int binaryRecursive(int[] arr, int key, int i, int j){
        int count = 0;
        count++;
        if(i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) binaryRecursive(arr, key, mid + 1, j);
            else binaryRecursive(arr, key, i, mid - 1);
        }
        //System.out.println("The number of steps by recursive binary: "+ count);
        return  -1;
    }
    public static int binaraySearch(int[] arr, int key){
        int i = 0;
        int j = arr.length-1;
        int steps = 0;
        while (i <= j){
            steps ++;
            int mid = (i + j)/2;
            if(arr[mid] == key) {
                System.out.println("The steps by Binary search:"+ steps);
                return mid;
            }
            else if (arr[mid] < key) i = mid+1;
            else j = mid-1;
        }
        System.out.println("The steps by Binary search:"+ steps);
        return -1;
    }
    public static int linearSearch(int[] arr, int key){
        int step = 0;
        for (int i = 0; i < arr.length; i++) {
            step++;
            if(arr[i] == key) {
                System.out.println("LinearSearch Steps:"+step);
                return i;
            };
        }
        System.out.println("LinearSearch Steps:"+step);
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[10000];

        int key = 900;

        int idx = linearSearch(nums, key);
        int idx2 = binaraySearch(nums, key);
        int idx3 = binaryRecursive(nums,key,0,nums.length-1);
        System.out.println("The index of the key is:"+idx);
        System.out.println("The index of the key by binary serarch is:"+ idx2);
        System.out.println("The index of the key by binary recursive serach is:"+idx3);
    }
}
