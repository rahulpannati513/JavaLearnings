package arraydsa.basics;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
        pattern5(n);
    }
//    static void pattern1(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//    }
//    static  void pattern2(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern3(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" "+j);
//            }
//            System.out.println();
//        }
//    }
//    static void pattern5(int n){
//        for (int i =0; i<=n; i++){
//            for (int j=n; j>i; j--){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//    }

//    static  void pattern5(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j > i; j--) {
//                System.out.println(j-n+1);
//
//            }
//        }
//    }
    static void pattern5(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
