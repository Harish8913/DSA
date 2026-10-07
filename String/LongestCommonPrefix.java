package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        String comparisionString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String iterationString = strs[i];
            if (comparisionString.length() < iterationString.length()) {
                iterationString = comparisionString;
                comparisionString = strs[i];
            }

            for (int j = 0; j < iterationString.length(); j++) {
                if (comparisionString.charAt(j) == iterationString.charAt(j)) {
                    commonPrefix += iterationString.charAt(j);
                    comparisionString = commonPrefix;
                }
            }
        }

        return commonPrefix;
    }
}
