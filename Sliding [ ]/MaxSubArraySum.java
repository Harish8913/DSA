public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 10, 10, 10, 20, 2, 2, 2, 4 };
        int k = 4;

        int value = test(arr, k);
        System.out.println(value);
    }

    public static int test(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum = maxSum - arr[i - k] + arr[i];

            if (windowSum > maxSum)
                maxSum = windowSum;
        }

        return maxSum;
    }
}
