package arraydsa.basics;

public class Count_Digits {
    public static void main(String[] args) {
        int n = 12346;
        count1(n);
    }
    static void count1(int  n){
        int count =0;
        for (int i =1;i<n;i++){
            n = n/10;
            count++;

        }
        System.out.println(count);
    }
}
