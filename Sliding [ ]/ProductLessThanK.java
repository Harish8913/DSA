public class ProductLessThanK {
    public static void main(String[] args){
        int[] nums = { 10,9,10,4,3,8,3,3,6,2,10,10,9,3 };
        int k = 19;
        solution(nums, k);
    }

    static int solution(int[] nums, int k){
        int left = 0;
        int count = 0;
        int currProduct = nums[0];

        for(int i =1; i < nums.length; i++){
            if(currProduct < k) count++;
            if(nums[i] < k) count++;
            currProduct = currProduct * nums[i];
            if(currProduct >= k){
                currProduct = currProduct / nums[left];
                left++;
            }else{
                count++;
            }
        } 

        return count;
    }
}
