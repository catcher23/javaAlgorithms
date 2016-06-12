//Given a string, find the length of the longest substring without repeating characters.

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Character> map = new HashMap<>();
        int longest = 0, count = 0, length = s.length(), i,j;
        char letter;

        for (i = 0; i < length; i++) {
            if (longest >= length - i) {
                return longest;
            }
            outerLoop:
            for (j = i; j < length; j++) {
                letter = s.charAt(j);
                if (!map.containsKey(letter)) {
                    map.put(letter, letter);
                    count += 1;
                    longest = count > longest ? count : longest;
                } else {
                    map.clear();
                    count = 0;
                    break outerLoop;
                }
            }
        }
        return longest;
    }
}