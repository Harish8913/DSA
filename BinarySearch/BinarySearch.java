package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 6, 11, 34, 39, 94, 100 };
        int target = 40;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }
}
