import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> ans = fourSum(nums, -294967296);
        System.out.println(ans);
    }
 
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; 
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j])
                    continue;
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long answer = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    System.out.println(answer + " Its meee");
                    System.out.println(target + " Its youuuu");
                    if (answer == target) {
                        List<Integer> newList = new ArrayList<>();
                        newList.add(nums[i]);
                        newList.add(nums[j]);
                        newList.add(nums[left]);
                        newList.add(nums[right]);

                        result.add(newList);

                        left++;
                        right--;

                        while (left < right && nums[left - 1] == nums[left])
                            left++;
                        while (left < right && nums[right + 1] == nums[right])
                            right--;
                    } else if (answer < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
