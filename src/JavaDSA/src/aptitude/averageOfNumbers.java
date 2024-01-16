package aptitude;

public class averageOfNumbers {
    static  int avgOfNoddNatrualNumbers(int n){
        int avg=0;
        int i =200;
        int count =0;
        int sum= 0;
        while(i != 0 ){
            if (i%2 != 0){
                count++;
                System.out.println("odd Number" + i );
                sum= i+ sum;


            }
i--;
        }
        System.out.println(sum);
        System.out.println(count);
        if (count == n){
            return avg=sum/count;
        }
        return avg;
    }

    public static void main(String[] args) {
        avgOfNoddNatrualNumbers(50);
    }

}
