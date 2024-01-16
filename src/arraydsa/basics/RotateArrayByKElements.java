package arraydsa.basics;

public class RotateArrayByKElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =2;
        int n = 7;
        rotate(arr,k,n);
//        int [] ans=rotate(arr,k,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    static void rotate(int[] arr,int k,int n){
        if (n == 0 ) return ;
        k = k%n;
        if(k>n) return ;
        int[] temp = new int[k];
        for (int i= n-k;i<n;i++){
            temp[i-n+k]= arr[i];
        }
        for (int i = n-k-1; i >=0 ; i--) {
            arr[i+k ]=arr[i];

        }
        for (int i= 0;i<k;i++){
            arr[i]=temp[i];
        }
        return ;
    }
}
