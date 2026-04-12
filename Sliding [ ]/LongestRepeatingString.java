import java.util.HashMap;

public class LongestRepeatingString {
    public static void main(String[] args) {
        String s = "abcabcbabcabcababaa";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                System.out.println("Current r : " + i);
                System.out.println(l + " " + (map.get(c) + 1) + " Before Change");
                l = Math.max(l, map.get(c) + 1);
                System.out.println(l + " " + " After Change");
            }

            map.put(c, i);
            maxLength = Math.max(maxLength, i - l + 1);
        }

        return maxLength;
    }
}
