import java.util.HashMap;

public class MaxCostOfSubString {
    public static void main(String[] args){
        String s = "okyytyj";
        String chars = "uafndmokwztrjphgle";
        int[] vals = { 189,-229,860,782,-194,-582,-743,966,777,90,526,-806,-992,845,-997,340,80,705 };

        System.out.println(solution(s, chars, vals));
    }

    static int solution(String s, String chars, int vals[]){
        int cost = 0;
        int maxCost = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < vals.length; i++) map.put(chars.charAt(i), vals[i]);
        
        for(int i = 0; i < s.length(); i++){
            int code = Math.abs((int) s.charAt(i) - 97);
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), code + 1);

            cost += map.get(s.charAt(i));
            maxCost = cost > maxCost ? cost : maxCost;
            cost = cost <= 0 ? 0 : cost;
        }

        return maxCost;
    }
}
