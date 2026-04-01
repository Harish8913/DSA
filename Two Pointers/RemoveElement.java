import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int[] nums = { 3, 3 };
        int val = 5;

        System.out.println(Arrays.toString(solution(nums, val)));
    }

    static int[] solution(int[] nums, int val){
        int l = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[l] != val) l++;

            if(nums[l] == val && nums[i] != val){
                int sw = nums[l];
                nums[l] = nums[i];
                nums[i] = sw;

                l++;
            }
        }

        System.out.println(l);

        return nums;
    }
}
