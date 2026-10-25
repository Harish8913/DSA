import java.util.Arrays;

public class BoatsToSave {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 4, 3 };
        int limit = 4;
        numRescueBoats(nums, limit);
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0; 
        int right = people.length - 1; 
        int count = 0;

        while (left <= right) {
            int sum;
            if (left == right)
                sum = people[left];
            else
                sum = people[left] + people[right];

            if (sum > limit) {
                count++;
                right--;
            } else {
                count++;
                left++;
                right--;
            }
        }

        return count;
    }
}
