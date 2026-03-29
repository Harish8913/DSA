class SortedDuples{
    public static void main(String[] args){
        int[] arr = { 1,2,2,3,3,3,3,4,4,4,5,6,6,7,7,8 };
        System.out.println((removeDuplicates(arr)));
    }

    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        
        for(int fast = 1; fast < nums.length; fast++){
           if(nums[fast] != nums[slow]){
            slow++;
            nums[slow] = nums[fast];
           }
        }

        // 1,2,3,4,5,6,7,8,4,4,5,6,6,7,7,8
        return slow + 1;
    }
}