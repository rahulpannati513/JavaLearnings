package arraydsa;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int [] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum[i]= sum[i]+arr[j];
            }
        }
        System.out.println(Arrays.toString(sum));
    }
}
