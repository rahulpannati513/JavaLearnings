package knowBasicMaths;

public class ReverseAnumber {
    public static void main(String[] args) {
        System.out.println(bruteforce(123456));
    }
    static int bruteforce(int n){
        int rev =0;
        while(n!=0){
            int a = n%10;
             rev = rev * 10+a;
             n = n/10;

        }
        return rev;
    }

}
