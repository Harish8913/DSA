package BinarySearch;

public class MinimumInRotatedSorted {
    public static void main(String[] args){
        int[] nums = { 3,3,1,3 };
        findMin(nums);
    } 

    public static int findMin(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int minimum = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] < minimum) minimum = nums[mid];
            if(nums[low] < nums[mid]){
                if(nums[low] < minimum) minimum = nums[low];
                low = mid + 1;
            }else if(nums[mid] < nums[high]){
                if(nums[mid] < minimum) minimum = nums[mid];
                high = mid - 1;
            }else if(nums[mid] > nums[high]){
                if(nums[high] < minimum) minimum = nums[high];
                low = mid + 1;
            }else{
                high -= 1;
            }

        }

        return minimum;
    }
}
