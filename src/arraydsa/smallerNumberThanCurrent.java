package arraydsa;

import java.util.Arrays;

public class smallerNumberThanCurrent {
    public static void main(String[] args) {
        int[]arr = {8,1,2,2,3};
        int count =0;
        int [] newarr= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if((arr[i]>arr[j]) && (arr[j]!=i)){
                    count++;
                    newarr[i]=count;
                }
                }
            count=0;

            }
        System.out.println(Arrays.toString(newarr));
    }
}
