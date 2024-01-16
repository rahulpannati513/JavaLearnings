package arraydsa;

public class findMaximunConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,1,1,1,1,0,0,0};
        System.out.println("maximun one's :"+maxones(arr));
    }
    static int maxones(int []arr){
        int count=0;
        int maxcount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }else {
                count =0;
            }
            maxcount = Math.max(maxcount,count);



        }
        return maxcount;
    }

}
