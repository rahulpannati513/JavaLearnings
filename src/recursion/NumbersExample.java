package recursion;

public class NumbersExample {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        // print first 5 numbers : 1 2 3 4 5
        print1(1);
    }
    static  void print1(int n){
//        if(n ==5){
//            System.out.println(5);
//            return;
//        }

        System.out.println(n);
        print1(n+1);
        System.out.println(n-1);
    }

}
