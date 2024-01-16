package arraydsa;

public class sortedArrayOptimized {
    public static void main(String[] args) {
    int arr1[] = {22,44,66,77,88,99};
        System.out.println("if array sorted or not :"+isSorted(arr1));
    }

     static boolean isSorted(int[] arr1) {
         for (int i = 1; i < arr1.length; i++) {
             if(arr1[i]<arr1[i-1]){
                 return false;
             }

         }
         return true;
     }



}
