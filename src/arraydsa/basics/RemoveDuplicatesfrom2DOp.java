package arraydsa.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesfrom2DOp {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,4};
       int ans= optimal2d(arr);
        System.out.println(ans);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ans);

        }
    }
    static int optimal2d(int[] arr){
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                arr[i+1]= arr[j];
                i++;
            }

        }
        return i+1;
    }
}

