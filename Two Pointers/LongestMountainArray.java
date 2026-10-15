public class LongestMountainArray {
    public static void main(String[] args){
        int[] nums = { 2,1,4,7,3,2,5 };
        longestMountain(nums);
    }

    public static int longestMountain(int[] nums){
        if(nums.length < 3) return 0;

        int left = 0;
        int right = nums.length - 1;

        while(left < right && nums[left] >= nums[left + 1]) left++;
        while(left < right && nums[right] >= nums[right - 1]) right--;

        System.out.println(left + " " + right);

        return right == left ? 0 : right - left + 1;
    }
}
