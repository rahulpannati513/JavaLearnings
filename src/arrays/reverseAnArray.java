package arrays;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,4,3,2};
       int [] z = (RevArr(arr));
//        System.out.println("Orginal Array : "+ Arrays.toString(arr));
//        System.out.println("reversed Array: "+Arrays.toString(z));
        printArray(z);

    }
    static int[] RevArr(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j =0;
//        for (int i = 0; i < n; i++) {
//            ans[j++]=arr[n-1-i];
//        } another approach
        for (int i = n-1; i >=0 ; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static  void printArray( int [] arr){
       int n = arr.length-1;
        System.out.print("[");
        for (int i = 0; i < arr.length-2; i++) {
            System.out.print(" "+arr[i]+",");
            if (arr[n]==n){
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
        System.out.println();

        }
//        System.out.print("]");
    }
