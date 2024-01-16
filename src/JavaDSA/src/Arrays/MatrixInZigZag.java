package Arrays;

public class MatrixInZigZag {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println("before Matrix: ");
        Print(arr);
        System.out.println("After Matrix :");
        zigzag(arr);
//        Print(arr);


    }
    static void zigzag(int [][] arr){
//        int row= arr.length;
//        int column = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                for (int j = 0; j< arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();

            }else {
                for (int j =arr[i].length-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }

        }
    }
    static void Print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}


