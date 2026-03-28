import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = new int[] { 4, 5, 1, 2 };
        System.out.println(Arrays.toString(secondMethod(numbers)));
    }

    static ArrayList<Integer> firstMethod(int[] arr) {
        ArrayList<Integer> reversedArray = new ArrayList<Integer>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int element = arr[i];
            reversedArray.add(element);
        }
        return reversedArray;
    }

    static int[] secondMethod(int[] arr) {

        if(arr == null || arr.length < 2) return arr;

        int leftPointer = 0, rightPointer = arr.length - 1;

        while(leftPointer < rightPointer){
            int swappMaterial = arr[leftPointer];

            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = swappMaterial;

            leftPointer += 1;
            rightPointer -= 1;
        }

        return arr;
    }
}
