package arrays;

import java.util.Arrays;

public class prefixArray {
    public static void main(String[] args) {
        int arr[]= {2,1,3,4,5};
        System.out.println(Arrays.toString(prefixArray(arr)));

    }
    static  int[] prefixArray(int []arr){
//       int n = arr.length;
//       int[] pref  = new int[n]; // declaring new array with size n i.e ... array length size
//        pref[0] = arr[0];
//        for (int i = 1; i <arr.length; i++) {
//            pref[i]=pref[i-1]+arr[i];
//        }
//        return pref;
        //optimised code
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
            
        }
        return arr;
    }
}
