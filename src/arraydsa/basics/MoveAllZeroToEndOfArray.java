package arraydsa.basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,54,0,60,0,0,7,5,0,0,54};
//        int [] ans = zeros_end(arr);
        System.out.println(Arrays.toString(zeros_end(arr)));
    }
    static int[]  zeros_end(int[] arr){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    //Creating a temp arrayList to store the elements to the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
            temp.add(arr[i]);
        }
        // now we are checking the size of  the non zero elements
        int nz = temp.size();

        // now filling back the orginal array with only non -zero
        for (int i = 0; i <nz; i++) {
            arr[i]=temp.get(i);
        }
        // now we are filling rest of the cells with zero's
        for (int i = nz; i <arr.length; i++) {
            arr[i]= 0;
        }
        return arr;
    }

}
