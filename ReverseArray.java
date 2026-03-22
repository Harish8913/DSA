import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 4, 3, 2, 6, 5 };
        System.out.println(firstMethod(numbers));
    }

    static ArrayList<Integer> firstMethod(int[] arr){
        ArrayList<Integer> reversedArray = new ArrayList<Integer>();
        
        for(int i =arr.length - 1; i >= 0; i--){
            int element = arr[i];
            reversedArray.add(element);
        }
        return reversedArray;
    }
}
