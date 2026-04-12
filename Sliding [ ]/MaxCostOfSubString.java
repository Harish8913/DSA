import java.util.HashMap;

public class MaxCostOfSubString {
    public static void main(String[] args){
        String s = "adaa";
        String chars = "d";
        int[] vals = { -100 };

        System.out.println(solution(s, chars, vals));
    }

    static int solution(String s, String chars, int vals[]){
        int currentMax = 0;
        int globalMax = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            
        }

        return globalMax;
    }
}
