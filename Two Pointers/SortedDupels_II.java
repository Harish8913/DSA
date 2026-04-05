import java.util.Arrays;

public class SortedDupels_II {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int[] answer = solution(nums);
        System.out.println(Arrays.toString(answer));
    }

    static int[] solution(int[] nums) {
        int leftPtr = 0;
        int occurence = 0;
        int currNum = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(currNum == nums[i]){
                occurence+=1;
            }else{
                currNum = nums[i];
                occurence = 0;
                leftPtr = i;
            }

            if(nums[i] != nums[leftPtr] && occurence > 2){
                int swapp = nums[i];
                nums[i] = nums[leftPtr];
                nums[leftPtr] = swapp;

                leftPtr++;
            }

        }

        return nums;
    }
}
