package arrays;

import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        // Taking Matrix Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num of Row and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter the "+r*c+" elements");
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//      int[][] ans =   findTranspose(arr,r,c);
//        printArray(ans);
        int[][] ans1 = findTransposeInPlace(arr,r,c);
        printArray(ans1);
    }
    static  void printArray(int [][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static  int[][] findTranspose(int[][] matrix,int r,int c){
        int[][] ans = new int[c][r];// this is declaring c and r because this can be used as tranpose so rows and colums will interchange some times
        for (int i = 0; i< c; i++){
            for (int j = 0; j <r; j++) {
                ans[i][j]= matrix[j][i];
            }
        }
        return ans;
    }
//    static int[][] findTransposeInPlace(int[][] matrix ,int r, int c){
//
//        for (int i = 0; i < r; i++) {
//            for (int j = i; j <c; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i]= temp;
//            }
//
//        }
//
//        return matrix;
//    }

    static int[][] findTransposeInPlace(int[][] matrix, int r, int c) {
        int[][] transposed = new int[c][r]; // Transposed matrix will have dimensions c x r

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

}
