package arraydsa.basics;

public class Integer_To_Strings {
    public static void main(String[] args) {
        int n = 1232435434;
        count(n);
    }
    static  void count(int n){
        String s = Integer.toString(n);
        System.out.println(s.length());
    }

}
