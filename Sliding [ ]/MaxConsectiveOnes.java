public class MaxConsectiveOnes {
    public static void main(String[] args){
        int[] nums = { 1,1,1,0,0,0,1,1,0 };
        solution(nums);
    }

    public static int solution(int[] nums){
        int max = 0;
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                curr+=1;
            }else{
                curr = 0;
            }

            max = Math.max(max, curr);
        } 

        return max;
    }
}
