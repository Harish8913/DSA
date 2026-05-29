package BinarySearch;

public class FirstOccurence {
    public static void main(String[] args){
        int[] nums = {10,10,10};
        int target = 10;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[low] == target) return low;

            if(nums[mid] < target) low = mid + 1;
            else if(nums[mid] >= target) high = mid;
            else low += 1;
        }
        return -1;
    }
}
