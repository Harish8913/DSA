import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int[] nums = { 1,2,1,0,1,0,2,1,0,1,0,2 };
        System.out.println(Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums){
        int l = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int sw = nums[l];
                nums[l] = nums[i];
                nums[i] = sw;

                l++;
            }
        }

        return nums;
    }
}
