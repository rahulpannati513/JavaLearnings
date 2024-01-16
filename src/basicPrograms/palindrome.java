public class palindrome {
    public static void main(String[] args) {
        palindrome(45774);
    }
    static  void palindrome(int value){
        int r ,temp;
        int sum = 0;
        temp = value;
        while(value >0){
            r= value % 10;
            sum = (sum * 10)+r;
            value=value/10;
        }
        if (temp == sum){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");

        }
    }

}