package BinarySearch;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] nums = { 1, 9, 7, 3, 5, 2 };
        int k = 4;
        search(nums, k);
    }

    public static int search(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currentCow = stalls[0];
            int cows = 1;

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - currentCow >= mid) {
                    cows++;
                    currentCow = stalls[i];
                }
            }

            if (cows >= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
