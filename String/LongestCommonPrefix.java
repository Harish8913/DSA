package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        for (int i = 1; i < strs.length; i++) {
            String s = strs[0];
            String iterationString = strs[i];
            if (s.length() < strs[i].length()) {
                iterationString = s;
                s = strs[i];
            }

            for (int j = 0; j < iterationString.length(); j++) {
                if (s.charAt(j) == iterationString.charAt(j)) {
                    commonPrefix += s.charAt(j);
                    
                }
            }
        }

        return commonPrefix;
    }
}
