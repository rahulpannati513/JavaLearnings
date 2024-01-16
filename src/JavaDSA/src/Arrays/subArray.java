package Arrays;

import java.util.Arrays;

public class subArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(subArray_(arr)));

    }
    static int[] subArray_(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(k+" ");

                }
                System.out.println();

            }

        }
        return arr;
    }

}
