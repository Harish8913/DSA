package BinarySearch;

public class LowerBound {
    public static void main(String[] args){
        int[] nums = { 2, 3, 7, 10, 11, 11, 25 };
        int target = 9;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = high;

        while(low <= high){
            int mid = low + ( high - low ) / 2;
            if(nums[mid] >= target){  // make it nums[mid] > target to get upperbound
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }

        return ans;
    }
}
