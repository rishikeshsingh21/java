package Arrays.oneDArray;

public class SingleUniqueEleInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != -1){
                System.out.println("The unique element is:"+arr[i]);
                break;
            }
        }
        System.out.println("There is no unique element");
    }
}
