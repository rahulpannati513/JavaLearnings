package arraydsa.basics;
import java.util.Arrays;
public class moveszerosOPtimal {
    public static void main(String[] args) {
         int[] arr = {1,23,46,0,2,0,8,0,4,7,0};
//         int ans = Arrays.toString(movenz(arr));//String cannot be converted to int so better to convert to loopand iterate
        int[] ans = movenz(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]+" ");
        }
//        System.out.println("");


    }
    static int[]  movenz(int[] arr){
        int j =-1;//placing the pointer

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                j = i;
                break;
            }
        }
        // if found no non zeros in the arrray
        if (j == -1) return arr;

        // move the pointer i and j
        // swap  accordingly:
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;

    }
}
