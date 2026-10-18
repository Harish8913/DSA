import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 9, 8, 5, 3, 2, 6, 8, 9, 2, 4, 5 };
        triangleNumber(nums);
    }

    public static int triangleNumber(int[] nums) {
        if (nums.length < 3)
            return 0;
        int count = 0;

        Arrays.sort(nums);

        for (int k = nums.length - 1; k >= 2; k--) {
            int left = 0;
            int right = k - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[k]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
}
