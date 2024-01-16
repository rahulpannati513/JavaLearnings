package arraydsa;

public class concatinateArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

       int[] ans=getConcatenation(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");

        }
        System.out.println();
        System.out.println(ans);
    }


    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<2*n;i++){
            int z = i%n;
            ans[i]=nums[z];
        }

        return ans;
    }
}
