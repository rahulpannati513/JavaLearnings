package knowBasicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
       // System.out.println(bruteforce(371));
        if(bruteforce(1634)) {
            System.out.println("It is a Palindrome");
        } else  {
            System.out.println("It is not a Palindrome");
        }

    }
    static boolean bruteforce(int n){
        double countDigits =(int)(Math.log10(n)+1);// as the Math.log10(n)+1 will return the float or long value it shoud be type casted to int
        int dup = n;
        double sum =0;
        while(n!=0){
            int lastdigit=n%10;
            sum = sum + Math.pow(lastdigit,countDigits);
            n= n/10;
        }
        return  (sum==dup);
    }
}
