package recursion;

public class fibonacci {
    //Recursion helps us in solving bigger/complex  problems in a simple way.
    //You can convert recursion in to soln into iteration and vice versa.
    //spacecomplexity is not constant.
    //because of recursive calls each recursive call takes one space so spaccomplexity is 0(N);
    // it helps us in breaking down in to smaller problems.
    public static void main(String[] args) {
        System.out.println(fibo(4));

    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
