public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }
    static  void factorial(long value){
        int  i;
        long fact =1;
        for(i=1;i<=value;i++){
             fact = fact * i;

        }
        System.out.println("factorial of "+value+" is : "+fact);
    }
}
