package arrays;

public class TargetSumTriple {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 2, 3, 4, 5, 6, 7, 1, 0, 3};
        int targetSum = 10;
        int[] result = triple(arr, targetSum);
        if (result[0] == -1) {
            System.out.println("No such triplet found.");
        } else {
            System.out.println("Triplet found: " + arr[result[0]] + ", " + arr[result[1]] + ", " + arr[result[2]]);
        }
    }

    static int[] triple(int[] arr, int sum) {
        int n = arr.length;
        int[] result = new int[]{-1, -1, -1}; // Initializing with -1 indicating no triplet found

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                        return result; // Found the triplet, return the indices
                    }
                }
            }
        }
        return result; // No triplet found
    }
}

//class Solution {
//    public int[] buildArray(int[] nums) {
//        // int n = nums.length;
//        // int [] ans= new int[n];
//
//        // for(int i = 0; i< n; i++){
//        //     ans[i]=nums[nums[i]];
//        // }
//        // return ans;
//
//        int n = nums.length;
//       for(int i =0; i< n; i++){
//           nums[i]= n*(nums[nums[i]]%n)+nums[i];
//       }
//        for(int i =0; i< n; i++){
//         nums[i]=nums[i]/n;
//       }
//       return nums;
//    }
//}