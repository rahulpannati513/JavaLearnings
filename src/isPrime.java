public class isPrime {

    public static void main(String[] args) {
//     int n =20;
//     for(int i=1;i<=n;i++){
//         System.out.println(i+" "+prime(i));
//     }
        System.out.println(prime(8));
    }
    static boolean prime(int n){
        if(n<=1){
            System.out.println("The value 1 is not a Prime ");
            return false;
        }
        int c =2;
        while(c*c<=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
