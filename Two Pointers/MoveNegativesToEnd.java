import java.util.Arrays;

public class MoveNegativesToEnd {
    public static void main(String[] args){
        int[] nums = { 1 ,-1, 3 ,2, -7 ,-5, 11, 6 };
        System.out.println(Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums){
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                int sw = nums[i];
                nums[i] = nums[j];
                nums[j] = sw;

                j++;
            }
        }
        return nums;
    }
}
