package arrays;



import java.util.Arrays;

public class revArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
//        int[] ans =justReverse( arr) ;
        System.out.println(Arrays.toString(justRevereUsingFor( arr)));
    }
    static int[] justReverse(int[] arr){
        //using while loop
        int i = 0,j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        return arr;

    }
    static  int[] justRevereUsingFor(int [] arr){
        int j = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }
}
