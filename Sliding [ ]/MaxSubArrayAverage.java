public class MaxSubArrayAverage {
    public static void main(String[] args){
        int[] nums = { 1,3,5,3,5,8,0,1,7 };
        double answer = solution(nums, 3);
        System.out.println(answer);
    }

    public static double solution(int[] nums, int k){
        double windowAvg = 0;
        double maxAvg = 0;
        
        for(int i = 0; i < k; i++){
            windowAvg += nums[i];
        }

        windowAvg /= k;
        maxAvg = windowAvg;

        for(int i = k; i < nums.length; i++){
            windowAvg = ((windowAvg * k) + (nums[i] - nums[i - k])) / k;
            maxAvg = Math.max(maxAvg, windowAvg);
        }

        return maxAvg;
    }
}
