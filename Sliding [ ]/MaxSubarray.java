public class MaxSubarray {
    public static void main(String[] args){
        int[] nums = { -2,1,-3,4,-1,2,1,-5,4 };
        System.out.println(solution(nums));
    }

    static int solution(int[] nums){
        int currentMax = nums[0];
        int globalMax = Integer.MIN_VALUE;

        for(int num: nums){
            currentMax += num;
            globalMax = currentMax > globalMax ? currentMax : globalMax;
            currentMax = currentMax < 0 ? 0 : currentMax;
        }

        return globalMax;
    }

    static int my_Solution(int[] nums){
        int currentMax = nums[0];
        int globalMax = currentMax;

        for(int num: nums){
            if(currentMax > num + currentMax){
                currentMax = num;
            }else{
                currentMax += num;
            }

            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}
