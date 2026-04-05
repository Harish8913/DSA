import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        int[] squares = { -7,-3,2,3,11 };
        System.out.println(Arrays.toString(solution(squares)));
    }

    static int[] solution(int[] nums) {
        int[] squared = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int j = nums.length - 1;

        while (j >= l) {
            if (Math.abs(nums[l]) >= Math.abs(nums[j])) {
                squared[r] = nums[l] * nums[l];
                l++;
            } else {
                squared[r] = nums[j] * nums[j];
                j--;
            }

            r--;
        }

        return squared;
    }
}
