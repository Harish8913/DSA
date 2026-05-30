package BinarySearch;

public class SearchIn2d {
    public static void main(String[] args) {
        int[][] nums = { { 1 } };
        int target = 7;
        search(nums, target);
    }

    public static boolean search(int[][]nums, int target){
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid][0] > target) high = mid - 1;
            else low = mid + 1;
        }

        if (high < 0) return false;
        int low2 = 0;
        int high2 = nums[high].length - 1;
        while(low2 <= high2){
            int mid = low2 + (high2 - low2) / 2;
            System.out.println("hi");
            if(nums[high][mid] == target) return true;

            if(nums[high][mid] > target) high2 = mid - 1;
            else low2 = mid + 1;
        }

        return false;
    }
}
