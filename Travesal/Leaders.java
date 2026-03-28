import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args){
        int[] arr = { 50,1,46,4,5,45,6,7,8,9,10 };
        System.out.println(leaders(arr));
    }

    static ArrayList<Integer> leaders(int[] arr){
        int maxRight = arr[arr.length - 1];
        ArrayList<Integer> result = new ArrayList<Integer>();

        result.add(maxRight);

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] >= maxRight){
                maxRight = arr[i];
                result.add(maxRight);
            }
        }

        Collections.reverse(result);
        return result;
        
    }
}
