package arrays;

import java.util.Arrays;

public class removeDuplicateSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,5};
        int[] ans =removeDup(arr );
        System.out.println(Arrays.toString(ans));
    }
    static int[]  removeDup(int[] arr){
        int nd = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[nd]!=arr[i]){
                nd++;
                arr[nd] = arr[i];
            }
        }
        return arr;
    }
}
