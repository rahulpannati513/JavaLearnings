package arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,6,7};
        System.out.println(    swap(1,3));
    }

    static String swap(int a, int b){
        System.out.println("before swap a : "+a);
        System.out.println("before swap b : "+b);
        int temp  = a;
         a= b;
         b = temp;

         return "after a : "+a+"\nafter b: "+b;
    }


}
