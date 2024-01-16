import java.util.Scanner;

public class productOfTwoNum {
    public static void main(String[] args) {
        System.out.println("enter the value of two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second value :");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        product(a, b);
    }
    public  static  void product(int a ,int b){
        int mul = a * b;
        System.out.println("The product of two value :"+mul);
    }

}
