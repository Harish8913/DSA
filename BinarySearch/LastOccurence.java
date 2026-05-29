package BinarySearch;

public class LastOccurence {
    public static void main(String[] args){
        int nums[] = { 1,1,1,1,2,2,2,2,3,4,5 };
        int target = 2;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[high] == target) return high;

            if(nums[mid] < target) low = mid + 1;
            else if(nums[mid] > target) high = mid;
            else high -= 1;
        }

        return -1;
    }
}
