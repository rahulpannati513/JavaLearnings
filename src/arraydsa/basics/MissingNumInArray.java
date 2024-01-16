package arraydsa.basics;

import com.sun.source.tree.BreakTree;

public class MissingNumInArray {
    public static void main(String[] args) {
        int [] arr ={1,2,4,5};
        int n = 4;
        int ans = findele(arr,n);
        System.out.println(" the element is: "+ans);
    }
    static int findele(int[] arr,int n){
        for (int i = 1; i <= n; i++) {
            int flag =0;
            for (int j = 0; j < n-1; j++) {
                if(arr[j]==i){
                    flag= 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }

        return -1;
    }


}
