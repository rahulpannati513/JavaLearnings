package arraydsa.basics;

import java.util.Arrays;

public class SearchIN2DArray {
        public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 6, 4}, {7, 6, 3}, {6, 3, 2}, {7, 22, 1}};
        int target = 3;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] Search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }

            }

        }
        return new int[]{-1,-1};

    }
}