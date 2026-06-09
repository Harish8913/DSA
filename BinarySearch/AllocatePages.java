package BinarySearch;

public class AllocatePages {
    public static void main(String[] args) {
        int[] nums = { 12, 65, 89, 90 };
        int students = 3;
        findPages(nums, students);
    }

    public static int findPages(int[] arr, int k) {

        int[] rangeValues = range(arr);
        if (k > arr.length)
            return -1;

        int low = rangeValues[0];
        int high = rangeValues[1];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canDistributePages(arr, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canDistributePages(int[] nums, int mid, int k) {
        int currentSumOfPages = 0;
        int studentsCount = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > mid)
                return false;

            if (nums[i] + currentSumOfPages > mid) {
                studentsCount++;
                currentSumOfPages = nums[i];

                if (studentsCount > k)
                    return false;
            } else {
                currentSumOfPages += nums[i];
            }
        }

        return true;
    }

    public static int[] range(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            sum += nums[i];
        }

        return new int[] { max, sum };
    }
}
