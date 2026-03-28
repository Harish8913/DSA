import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args){
        int[] arr = { 8, 1, 3, 10, 90, 19, 87, 90, 18, 77, 652, 4433, 77 };
        int[] minmax = minAndMax(arr);
        System.out.println(Arrays.toString(minmax));
    }

    static int[] minAndMax(int[] arr){
        int min = arr[0];
        int max = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        return new int[]{min, max};
    }
}
