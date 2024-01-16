package Arrays;

import java.util.Arrays;

public class InverseAnArray {
    public static void main(String[] args) {
        int[] arr ={2,3,1,0,4};
        System.out.println(  Arrays.toString(Inverse(arr))
);

    }
    static int[] Inverse(int[] arr){
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            newarr[v]=i;

        }
        return newarr;
    }

}
