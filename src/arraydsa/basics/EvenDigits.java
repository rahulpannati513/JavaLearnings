package arraydsa.basics;

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = { 12, 13, 54, 2234, 664, 3231, 32, 9 };
        int count = findNumbers(nums);
        System.out.println("Number of integers with even number of digits: " + count);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
