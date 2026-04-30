public class MinSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 10, 10, 10, 20, 2, 2, 2, 4 };
        int k = 4;

        int value = test(arr, k);
        System.out.println(value);
    }

    static int test(int[] nums, int target) {
        int l = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            if (sum >= target) {
                while (l < r) {
                    l++;
                    sum -= nums[l];

                    count = Math.min(count, r - l + 1);
                }
            } else {
                sum += nums[r];
            }

            count = Math.min(count, r - l + 1);
        }

        return count;
    }
}
