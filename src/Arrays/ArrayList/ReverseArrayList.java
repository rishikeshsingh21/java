package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(0);
        arrList.add(10);
        arrList.add(3);
        arrList.add(5);
        arrList.add(22);
        arrList.add(10);

        System.out.println(arrList);
        int i = 0;
        int j = arrList.size()-1;
        //System.out.println(j);
        while (i < j){
            Integer temp = arrList.get(i);
            arrList.set(i,arrList.get(j));
            arrList.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arrList);

        Collections.reverse(arrList);
        System.out.println(arrList);
        Collections.sort(arrList,Collections.reverseOrder());
        System.out.println(arrList);
    }
}
