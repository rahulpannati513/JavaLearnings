package Arrays;

public class maxSecond {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,3,2,6,7,9,99,3,4,32,45,22,5};
        int ans = SecondLargest(arr);
        System.out.println(ans);


    }
    static  int SecondLargest(int[] arr){
        int max1=0,max2 =0;
        if (arr[0]>arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]>max1){
                max2 =  max1;
                max1 = arr[i];
            } else if (arr[i]>max2) {
                max2 = arr[i];
            }

            }
            return max2;
        }

}
