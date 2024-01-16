package knowBasicMaths;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.sqrt;

public class divisorOfaNumber {
    public static void main(String[] args) {
        //System.out.println(bruteforce(36));
        System.out.println(better(36));
        System.out.println(optimal(36));
    }
    static int bruteforce(int n){
        int i= 1;
        for (i = 1; i<=n; i++) {
            if (n%i == 0){
                System.out.println(i);
            }

        }
        return i;
    }
    static ArrayList<Integer> better(int n){
ArrayList<Integer> divisor = new ArrayList<>();
        int i=1;
        for (i = 1; i <= sqrt(n); i++) {
            if (n%i == 0){
                divisor.add(i);
                if (n/i!=i){
                    divisor.add(n/i);
                }
            }

        }
        Collections.sort(divisor);
        return divisor;
    }
    static ArrayList<Integer> optimal(int n){
        ArrayList<Integer> divisor = new ArrayList<>();
        int i=1;
        for (i = 1; i*i <= n ; i++) {
            if (n%i==0){
                divisor.add(i);

                if ((n/i)!=i){
                    divisor.add(n/i);
                }
            }

        }
        Collections.sort(divisor);
        return divisor;
    }
}
