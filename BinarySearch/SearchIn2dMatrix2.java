package BinarySearch;

import java.util.Arrays;

public class SearchIn2dMatrix2 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 5;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] nums, int target) {
        int m = nums.length - 1;
        int n = nums[0].length - 1;

        int lowx = 0;
        int highy = n;

        int lowy = 0;
        int highx = m;

        while (lowx <= highy && lowy <= highx) {
            int midx = lowx + (highy - lowx) / 2;
            int midy = lowy + (highx - lowy) / 2;

            System.out.println(nums[midx][midy]);
            if (nums[midx][midy] == target)
                return new int[] { midx + 1, midy + 1 };

            if (nums[midx][midy] > target) {
                highx = midx;
                highy = midy;
            } else {
                lowx = midx + 1;
                highy = midy + 1;
            }
        }

        return new int[] { 0, 0 };
    }
}
