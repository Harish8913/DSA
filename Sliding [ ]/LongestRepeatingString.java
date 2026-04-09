import java.util.HashMap;

public class LongestRepeatingString {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                l = Math.max(l, map.get(c) + 1);
            }

            map.put(c, r);
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
