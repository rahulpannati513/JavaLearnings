package Patterns;

import java.util.Scanner;

public class patterdoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {

                if (i ==  (col-1)- j) {
                    System.out.print("$ ");

                } else {
                    System.out.print("* ");
                }

            }

            System.out.println();
        }
    }

//    static void doller(int row, int col) {
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//
//            }
//        }
//    }
}
