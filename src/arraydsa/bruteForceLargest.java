package arraydsa;
import java.util.*;
public class bruteForceLargest {
    public static void main(String[] args) {
        int [] arr1= {2,5,6,4,6,7};
        int largest = sort(arr1);
        System.out.println("largest element in a : "+Integer.toString(largest));
    }
    static int sort(int [] arr){
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }
}
