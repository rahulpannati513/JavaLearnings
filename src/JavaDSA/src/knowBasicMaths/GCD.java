package knowBasicMaths;

public class GCD {
    public static void main(String[] args) {
        System.out.println(bruteforce(3,6));
    }
    static int bruteforce(int num1,int num2){
        int ans= 1;
        for (int i = 1; i <= Math.min(num1,num2); i++) {
            if (num1%i == 0 && num2%i == 0){
                 ans = i;
            }


        }
        return ans;
    }

}
