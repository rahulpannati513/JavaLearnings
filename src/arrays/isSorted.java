package arrays;

public class isSorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,6};
        System.out.println(isSortedArray2(arr));
    }
    static  boolean isSortedArray(int[] arr){
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]){
                count++;
            }


        }
        if(count == arr.length){
            return true;
        }else
        {
            return false;
        }

    }
    static boolean isSortedArray2(int [] arr){
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<arr[i-1]){
                return false;
            }

        }
        return true;
    }

}
