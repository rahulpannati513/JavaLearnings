package arrays;

public class firstRepeatingNum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,2,5,3};
        System.out.println(firstRepNum(arr));

    }
    static int firstRepNum(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[j] ==arr[i]){
                    return arr[i];
                }

            }
        }
        return -1;
    }
}
