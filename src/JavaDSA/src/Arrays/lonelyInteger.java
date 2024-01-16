package Arrays;

import java.util.Arrays;

public class lonelyInteger {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,5,3,5};
//        lI(arr);
//        System.out.println(Arrays.toString());
       int []ans= lI(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans);
        }

    }
    static int[] lI(int[] arr){
        int j = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=arr[j]){
                System.out.println(i);
            }
            j++;
        }
        return arr;
    }
}
