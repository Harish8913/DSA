import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = { 2,0,2,1,1,0 };
        System.out.println(Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums) {
        int leftZeroPointer = 0;

        for (int i = 1; i < nums.length; i++) {
            int swapp = nums[leftZeroPointer];

            if (nums[leftZeroPointer] == 0)
                leftZeroPointer++;

            if (nums[leftZeroPointer] != 0 && nums[i] == 0) {
                nums[leftZeroPointer] = nums[i];
                nums[i] = swapp;

                leftZeroPointer++;

                // System.out.println(Arrays.toString(nums));
            }
        }

        int leftOnePointer = 0;
        for (int i = 1; i < nums.length; i++) {
            int swapp = nums[leftOnePointer];

            if (nums[leftOnePointer] == 1 || nums[leftOnePointer] == 0)
                leftOnePointer++;

            if (nums[leftOnePointer] != 1 && nums[leftOnePointer] != 0 && nums[i] == 1) {
                nums[leftOnePointer] = nums[i];
                nums[i] = swapp;

                leftOnePointer++;

            }
        }

        return nums;
    }
}
