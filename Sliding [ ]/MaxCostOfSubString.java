import java.util.HashMap;

public class MaxCostOfSubString {
    public static void main(String[] args){
        String s = "adaa";
        String chars = "d";
        int[] vals = { -100 };

        System.out.println(solution(s, chars, vals));
    }

    static int solution(String s, String chars, int vals[]){
        int cost = 0;
        int maxCost = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < vals.length; i++) map.put(chars.charAt(i), vals[i]);
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), i + 1);

            cost += map.get(s.charAt(i));
            maxCost = cost > maxCost ? cost : maxCost;
            cost = cost <= 0 ? 0 : cost;
        }

        return maxCost;
    }
}
