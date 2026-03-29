public class ArrayDuples {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,2,2,2,3,3,3,4,4,5,5,6,6,7,7,7 };
        int answer = solution(nums);
        System.out.println(answer);
    }

    static int solution(int[] nums) {
        if (nums.length < 1)
            return -1;

        int slow = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[slow] != nums[i]) {
                slow++;
                nums[slow] = nums[i];
            }
        }

        return slow + 1;
    }
}
