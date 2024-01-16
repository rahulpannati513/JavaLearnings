package arraydsa.basics;

import java.util.Arrays;

public class maxIn2Darray {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},{52,76,23,88},{21,32,41,76},{32,12,11,87}
        };
        int ans =max(arr);
        System.out.println(ans);

    }
    static int max(int[][] arr){
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>maxi){
                    maxi= arr[i][j];
                }

            }
        }
        return maxi;
    }
}
