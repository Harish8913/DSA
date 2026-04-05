import java.util.Arrays;

public class SortedDupels_II {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int[] answer = solution(nums);
        System.out.println(Arrays.toString(answer));
    }

    static int[] solution(int[] nums) {
        int l = 0;

        for (int num: nums) {
            if(l < 2 || nums[l - 2] != num){
                nums[l] = num;
                l++;
            }
        }

        return nums;
    }
}
