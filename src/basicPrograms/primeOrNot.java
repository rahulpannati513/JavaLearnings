public class primeOrNot {
    public static void main(String[] args) {
        prime(18);
    }
    static void prime(int value){
        int m, i;
        int flag = 0;
        m =value/2;
        if(value == 1 || value == 0){
            System.out.println(value+" is a prime Number");
        }
        for (i=2;i<m;i++){
            if(value % i == 0){
                System.out.println(value+" is not a prime number");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(value+" is a prime number");
        }
    }

}