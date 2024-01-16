package BitManupulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String a = "000000";
        System.out.println(B2D(a));
        int ans = B2D(a);
        System.out.println(D2B(ans));
    }
    static  int B2D(String a){
        int  b = 0;
        int powOf2 =1;
        for (int i = a.length()-1; i >0 ; i--) {
            if(a.charAt(i) == '1'){
                b = b+ powOf2;
            }
            powOf2 = powOf2*2;
        }
        return powOf2;
    }
    static String D2B(int n){
        String  b = "";
        while(n>=1){
            int x = n%2;
            n =n/2;
            b=x+b;
        }
        return b;
    }


}
