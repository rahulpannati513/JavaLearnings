package arraydsa;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        System.out.println(leftRotate(arr));
    }

     static int leftRotate(int[] arr) {
        int temp = arr[0];
         for (int i =0; i <arr.length-1 ; i++) {
             arr[i]=arr[i+1];
         }
         arr[arr.length-1]=temp;
         for (int i = 0; i < arr.length-1; i++) {
             System.out.print(arr[i]+" ");

         }

         return temp;
    }


}
