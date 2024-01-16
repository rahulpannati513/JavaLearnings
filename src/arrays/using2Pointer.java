package arrays;

import java.util.Arrays;

public class using2Pointer {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,8,9,11,12,14};

        printArray(sortArrayByParity(arr));


    }
    static  int[] sortArrayByParity(int[] arr){
        int n = arr.length;
        int left =0,right =n-1;
        while(left<right){
            if (arr[left] % 2 ==1 && arr[right]%2 ==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2 ==0){
                left++;
            }
            if(arr[right]% 2 ==1){
                right--;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static  void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
