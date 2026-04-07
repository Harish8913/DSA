import java.util.HashMap;

public class LongestRepeatingString {
    public static void main(String[] args) {
        String s = "pwwekw";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0,r = 0,maxLength = 0;
        HashMap<Character, Integer> alpha = new HashMap<>();
        for(char c = 'a'; c < 'z'; c++){alpha.put(c, 0);}

        while(r < s.length()){
            if(alpha.get(s.charAt(r)) == 0){
                alpha.put(s.charAt(r), 1);
                r++;
            }else{
                while(alpha.get(s.charAt(l)) == 1){
                    alpha.put(s.charAt(l), 0);
                    l++;
                }
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        System.out.println(maxLength);

        return maxLength;
    }
}
