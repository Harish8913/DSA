public class ContainerWIthMostWater {
    public static void main(String[] args){
        int[] nums = { 1,8,6,2,5,4,8,3,7 };
        int answer = solution(nums);
        System.out.println(answer);
    }

    static int solution(int[] height){
        int leftPtr = 0;
        int rightPtr = height.length - 1;
        int result = 0;
        int h = 0;

        while(leftPtr < rightPtr){
            h = Math.min(height[rightPtr], height[leftPtr]);
            int newResult = (rightPtr - leftPtr) * h;
            if(result < newResult) result = newResult;

            if(height[leftPtr] < height[rightPtr]){
                leftPtr++;
            }else{
                rightPtr--;
            }
        }
        
        return result;
    }
}


