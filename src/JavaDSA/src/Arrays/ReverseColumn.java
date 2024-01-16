package Arrays;

import java.util.Arrays;

public class ReverseColumn {
    public static void main(String[] args) {
//       int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
int [][] arr = {
        {1, 6,11,16,21},
        {2,7,12,17,22},
        {3,8,13,18,23},
        {4,9,14,19,24},
        {5,10,15,20,25}
};
       printArray(arr);
        System.out.println();
        System.out.println(Arrays.deepToString(arr));
       reverseMatrix(arr);
        System.out.println();
       printArray(arr);



        }
        static  void reverseMatrix(int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                int left = 0;
                int right = arr[0].length-1;
                while(left<right){
                    int temp = arr[i][left];
                    arr[i][left]=arr[i][right];
                    arr[i][right]=temp;
                    right--;
                    left++;
                }
            }
        }
        static void printArray(int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j]+"   ");
                }
                System.out.println();
            }
        }

}
