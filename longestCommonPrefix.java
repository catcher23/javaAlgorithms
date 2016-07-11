//Write a function to find the longest common prefix string amongst an array of strings.

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if (length == 0) {
            return "";
        }

        String prefix = "",
        potentialPrefix = "",
        str = strs[0];

        if (strs.length == 1) {
            return str;
        }

        for (int i = 1; i <= str.length() ; i++) {
            potentialPrefix = str.substring(0, i);
            for (int j = 1; j < length; j++) {
                if (potentialPrefix.length() > strs[j].length() || !potentialPrefix.equals(strs[j].substring(0, i))) {
                    return prefix;
                }
            }
            prefix = potentialPrefix;
        }
        return prefix;
    }
}