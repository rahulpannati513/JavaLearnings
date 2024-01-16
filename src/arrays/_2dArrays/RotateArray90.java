//package arrays._2dArrays;
//import java.util.Scanner;
//public class RotateArray90 {
//    public static void main(String[] args) {
//        System.out.println("Enter the row and colum:");
//        Scanner sc = new Scanner(System.in);
//        int r= sc.nextInt();
//        int c = sc.nextInt();
//        int[][]arr = new int [r][c];
//        System.out.println("Enter the "+r*c+" elements");
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j <c ; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        rotate90matrix(arr,r);
//        printArray2D(arr);
//
//    }
//    static  void printArray2D(int [][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//    static  void  InPlaceTranspote(int[][] arr,int r, int c) {
//                for (int i = 0; i < r; i++) {
//            for (int j = i; j < c; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//
//
//    }
//
//    static  void reverse(int []arr){
//        int i= 0, j=arr.length-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i]= arr[j];
//            arr[j]= temp;
//            i++;
//            j--;
//        }
//    }
//    static int[][] rotate90matrix(int[][] arr,int n){
//
//        InPlaceTranspote(arr,n, n );
//// reverse each row of transported matrix
//        for (int i = 0; i <n; i++) {
//          reverse(arr[i]);
//        }
//        return arr;
//    }
//}
//
////package arrays._2dArrays;
////
////import java.util.Scanner;
////
////public class RotateArray90 {
////    public static void main(String[] args) {
////        System.out.println("Enter the row and column:");
////        Scanner sc = new Scanner(System.in);
////        int r = sc.nextInt();
////        int c = sc.nextInt();
////        int[][] arr = new int[r][c];
////
////        System.out.println("Enter the " + r * c + " elements");
////        for (int i = 0; i < r; i++) {
////            for (int j = 0; j < c; j++) {
////                arr[i][j] = sc.nextInt();
////            }
////        }
////        rotate90matrix(arr, r, c);
////        printArray2D(arr);
////    }
////
////    static void printArray2D(int[][] arr) {
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////                System.out.print(arr[i][j] + " ");
////            }
////            System.out.println();
////        }
////    }
////
////    static void reverse(int[] arr) {
////        int i = 0, j = arr.length - 1;
////        while (i < j) {
////            int temp = arr[i];
////            arr[i] = arr[j];
////            arr[j] = temp;
////            i++;
////            j--;
////        }
////    }
////
////    static void rotate90matrix(int[][] arr, int r, int c) {
////        transpose(arr, r, c);
////        for (int i = 0; i < c; i++) {
////            reverse(arr[i]);
////        }
////    }
////
////    static void transpose(int[][] arr, int r, int c) {
////        for (int i = 0; i < r; i++) {
////            for (int j = i; j < c; j++) {
////                int temp = arr[i][j];
////                arr[i][j] = arr[j][i];
////                arr[j][i] = temp;
////            }
////        }
////    }
//}
