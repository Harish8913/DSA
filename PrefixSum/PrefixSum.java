package PrefixSum;
import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        main();
    }

    public static int[] main() {
        int[] arr = { 1,2,3,4,5,6,7,8 };

        if (arr.length < 2)
            return arr;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
