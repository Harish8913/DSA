public class LongestMountainArray {
    public static void main(String[] args){
        int[] nums = { 2,1,4,7,3,2,5 };
        longestMountain(nums);
    }

    public static int longestMountain(int[] arr){
        if(arr.length < 3) return 0;

        int count = 1;
        int left = 0;
        int right = 0;
        int maximum = 0;

        for(int i = 1; i <= arr.length - 2; i++){
            if(arr[i - 1] < arr[i] && arr[i + 1] < arr[i]){
                left = i - 1;
                while(left >= 0 && arr[left] < arr[left + 1]){
                    count++;
                    left--;
                }

                right = i + 1;
                while(right < arr.length && arr[right] < arr[right - 1]){
                    count++;
                    right++;
                }

                maximum = Math.max(maximum, count);
                count = 1;
            }
        }

        return maximum;
    }
}
