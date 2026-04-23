import java.util.Arrays;

public class ReverseInGroups {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12 };
        int k = 3; 

        System.out.println(Arrays.toString(test(arr, k)));
    }

    static int[] test(int[] arr, int k) {
        int leftPointer = 0;
        int rightPointer = k - 1;

        for (int i = 0; i < arr.length; i++) { 
            int lipointer = leftPointer; 
            int ripointer = rightPointer;

            if (rightPointer > arr.length - 1)
                return arr;

            while (lipointer < ripointer) {
                int swappMaterial = arr[lipointer];

                arr[lipointer] = arr[ripointer];
                arr[ripointer] = swappMaterial;

                lipointer++;
                ripointer--;
            }

            leftPointer += k;
            rightPointer += k;
        }

        return arr;
    }
}
