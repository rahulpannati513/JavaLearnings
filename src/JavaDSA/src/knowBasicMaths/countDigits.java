package knowBasicMaths;

public class countDigits {
    public static void main(String[] args) {
        //System.out.println(BFcountDigits(23544));
       // System.out.println(betterapproach(987765434));
        System.out.println(optimalapproach(234532322));

    }
    static  int optimalapproach(int n){
        int digits = (int) Math.floor(Math.log10(n)+1);
        return digits;
    }
    static int betterapproach(int n){
        String str = Integer.toString(n);
        int a =str.length();
        return a;
    }

    static  int BFcountDigits(int n){
        int count =0;
        while(n!=0){
            n = n/10;
            count++;
        }

        return count;
    }

}
