package arrays;

public class findSecondElement {
    public static void main(String[] args) {
        int arr[] = {3,7,4,9,0,1};
        System.out.println(  findSecond(arr));


    }
    static  int findSecond(int[]arr){
        int max = findMax(arr);
        for (int i =0; i<arr.length;i++){
            if(arr[i]==max){
             arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int j=0;j<arr.length;j++){
            if (arr[j]>max){
                max = arr[j];
            }
        }
        return max;
    }

}
