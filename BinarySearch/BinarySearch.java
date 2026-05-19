package BinarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {1, 4, 6, 11, 34, 39, 94, 100};
        int target = 4;
        search(nums, target);
    }

    static void search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + ( high - low ) / 2;
            if(nums[mid] == target) break;

            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }
        }
    }
}
