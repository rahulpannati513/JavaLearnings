import java.util.Scanner;

public class evenOrOdd {
    public static void main(String [] args){
        System.out.println("Please Enter the value to check : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value % 2==0 ){

            System.out.println("even");
        }else {
            System.out.println("odd");

        }

    }

}
