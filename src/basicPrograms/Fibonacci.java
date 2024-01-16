public class Fibonacci {
    public static void main(String[] args) {

        fibonacci(11);
    }
    static void fibonacci(int count){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        // basically fibonacci is the sum of two numbers in the past
        for ( int i =0; i<count;i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }

    }

}
