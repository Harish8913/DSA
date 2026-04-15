public class ProductLessThanK {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3 };
        int k = 19;
        solution(nums, k);
    }

    public static int solution(int[] nums, int k) {
        int count = 0;
        int product = 1;
        int left = 0;

        for (int r = 0; r < nums.length; r++) {
            product *= nums[r];

            while (product >= k && left <= r) {
                product /= nums[left];
                left++;
            }

            count += (r - left) + 1;
        }

        return count;
    }
}
