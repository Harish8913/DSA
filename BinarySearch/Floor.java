package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 8, 10, 10, 12, 19 };
        int floor = 10;
        int ans = search(nums, floor);
        System.out.println(ans);
    }

    static int search(int[] nums, int floor) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= floor) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
