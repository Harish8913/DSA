public class MinSubArray {
    public static void main(String[] args) {
        int[] arr = { 2,3,1,2,4,3 };
        int k = 8;

        int value = test(arr, k);
        System.out.println(value);
    }

    static int test(int[] nums, int target) {
        int l = 0;
        int sum = 0;    
        int count = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while(sum >= target){
                count = Math.min(count, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}
