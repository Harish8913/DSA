import java.util.HashMap;

public class LongestRepeatingString {
    public static void main(String[] args){
        String s = "dvdf";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() >= 1 && s.trim().length() <= 1) return 1;
        if(s.trim().length() < 1) return s.length();
        int end = 0;
        int count = 0, maxCount = 0;
        HashMap<Character, Integer> alphabets = new HashMap<Character, Integer>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabets.put(c, 0);
        }

        while(end < s.length()){
            if(alphabets.get(s.charAt(end)) == 0){
                count++;
                alphabets.put(s.charAt(end), 1);
                end++;
                if(count > maxCount) maxCount = count;
            }else{
                alphabets.replaceAll((key, value) -> 0);
                count = 0;
            }

            System.out.println(count + " " + maxCount + " " + end + " " + alphabets);
        }

        return maxCount;
    }
}
