public class ReverseANumber {
    public static void main(String[] args) {
        reverse(1234);
         reverseUsingStringBuffer(7685);
        reverseUsingStringBuilder(89634);
    }
    static void reverse(int value){
        // using algorithm

        int rev = 0;
        while(value!=0){
            rev = rev * 10 +value%10;
            value = value /10;

        }
        System.out.println("reverse a number" +rev);
    }
    static void reverseUsingStringBuffer(int val) {

        StringBuffer sb = new StringBuffer(String.valueOf(val));
        StringBuffer rev = sb.reverse();
        System.out.println(rev);

    }
    static void reverseUsingStringBuilder(int val){
        StringBuilder sv= new StringBuilder();
        sv.append(val);
        StringBuilder rev = sv.reverse();
        System.out.println(rev);


    }

}
