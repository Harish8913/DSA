package BinarySearch;

public class Ceil {
    public static void main(String[] args){
        int[] nums = { 1, 2, 8, 10, 10, 12, 19 };
        int target = 10;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
