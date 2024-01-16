package arrays;

import java.util.Scanner;

public class sumOfValuesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,1,3,6,5};
        int[] prefSum = rangeOf(arr);
        System.out.println("Enter the no of queries : ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the range: ");
             int l = sc.nextInt();
             int r = sc.nextInt();

             int ans = prefSum[r]-prefSum[l-1];
            System.out.println("Sum "+ans);
        }
    }
    static  int[]  rangeOf(int [] arr){
        // index should be start from 1-based indexing
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];

        }
        return arr;
    }
}
