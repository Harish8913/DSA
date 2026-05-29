package BinarySearch;

public class FirstOccurence {
    public static void main(String[] args){
        int[] nums = {1,1,2,2,2,3,3,3,4,5,6};
        int target = 3;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
