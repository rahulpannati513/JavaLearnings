package arrays._2dArrays;

public class Transpote {
    public static void main(String[] args) {
        int[][] arr = {{1,2 ,3, 4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("input array");
        printArray2d(arr);
//        transpote(arr,4 ,4);
        System.out.println("after transpote:");
        Rotate90(arr, 4, 4);
//        printArray2d(arr);


    }

    static  void  transpote(int[][] matrix, int r , int c){
        for (int i = 0; i < r; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
    }
    static  void printArray2d(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverse(int[]arr){
        int i = 0,j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void Rotate90( int[][]arr, int r,int c){
        transpote(arr,r,c);
        for (int i = 0; i < r; i++) {
            reverse(arr[i]);
        }
        printArray2d(arr);

    }

}
