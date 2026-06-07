package BinarySearch;

public class Shipping {
    public static void main(String[] args) {
        int[] nums = { 3, 6, 7, 11 };
        int h = 8;
        int ans = search(nums, h);
        System.out.println(ans);
    }

    static int search(int[] weights, int days) {
        int low = max(weights);
        int high = high(weights);

        while (low <= high) {
            int capacity = low + (high - low) / 2;
            int runningCapacity = 0;
            int currentdays = 1;

            for (int i = 0; i < weights.length; i++) {
                runningCapacity += weights[i];
                if (runningCapacity > capacity) {
                    currentdays++;
                    runningCapacity = weights[i];
                }
                ;
            }

            if (currentdays > days)
                low = capacity + 1;
            else
                high = capacity - 1;
        }

        return low;
    }

    private static int high(int[] weights) {
        int max = 0;
        for (int i = 0; i < weights.length; i++) {
            max += weights[i];
        }

        return max;
    }

    private static int max(int[] weights) {
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            high = Math.max(weights[i], high);
        }

        return high;
    }
}
