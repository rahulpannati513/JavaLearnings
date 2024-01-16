import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class sumOfTwoNum {
    public static void main(String[] args) {
        System.out.println("Enter the first Number: ");
        Scanner sc1 = new Scanner(System.in);
        int first = sc1.nextInt();
        System.out.println("Enter the second Number: ");
        Scanner sc2 = new Scanner(System.in);
        int second = sc2.nextInt();
        sumNum(first,second);

    }
    public static void sumNum(int first,int second){
        int sum = first + second;

        System.out.println("The sum of two values is : "+sum);

    }
}
