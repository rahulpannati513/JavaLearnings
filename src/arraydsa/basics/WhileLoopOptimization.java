package arraydsa.basics;

public class WhileLoopOptimization {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 6;

        for (int nums: arr) {
            if (nums == target) {
                System.out.println("Target Found :" + target);
                break;
            }
            System.out.println("checking :" + nums);
        }
        for (int nums:
             arr) {
            if(nums % 2 == 0){
                continue;
            }
            System.out.println("odd numbers: "+nums);

        }
    }
}
