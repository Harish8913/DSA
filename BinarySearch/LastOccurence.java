package BinarySearch;

public class LastOccurence {
    public static void main(String[] args){
        int nums[] = { 1,1,1,1,2,2,2,2,3,4,5 };
        int target = 1;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return ans;
    }
}
