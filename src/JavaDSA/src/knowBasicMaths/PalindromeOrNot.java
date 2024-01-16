package knowBasicMaths;

public class PalindromeOrNot {
    public static void main(String[] args) {
        //System.out.println(bruteforce(121));
     int x = 12345;
     if (x == bruteforcereturningpalindromeornot(x)){
         System.out.println("Palindrome");
     } else {
         System.out.println("Not a Palindrome");
     }
    }
    static boolean bruteforce(int n){
        int y = n;
        // 121 is should be 121 is a palindrome
        int rev = 0;
        while(n!=0){
            int a = n%10;
            rev = rev * 10 + a;
            n= n/10;
        }
        return rev==y;
    }
    static int bruteforcereturningpalindromeornot(int n){

        // 121 is should be 121 is a palindrome
        int rev = 0;
        while(n!=0){
            int a = n%10;
            rev = rev * 10 + a;
            n= n/10;
        }
        return rev;
    }

}
