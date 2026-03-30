import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SecondLargestDigit {
    public static void main(String[] args){
        int value = secondHighest("sjhtz8344");
        System.out.println(value);
    }

    public static int secondHighest(String s) {
        HashSet <Integer> nums = new HashSet<Integer>();
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int num = s.charAt(i) - '0';
                nums.add(num);
            }
        }

        int sl = -1;
        if(nums.size() < 1) return -1;

        List<Integer> list = new ArrayList<Integer>(nums);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) >= list.get(i - 1)){
                sl = list.get(i - 1);
            }
        }

        return sl;
    }
}
