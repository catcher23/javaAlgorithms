public class Solution {
    public String longestPalindrome(String s) {
        int middle, left, right;
        middle = s.length()/2;
        String longestPalindrome = String.valueOf(s.charAt(middle));
        int i = 0;
        while (i + middle < s.length()) {
            left = right = middle + i + longestPalindrome.length()/2;
            outerLoop:
            while (left >= 0 && right <= s.length()) {
                String subStr = s.substring(left, right);
                if (isPalindrome(subStr) && subStr.length() > longestPalindrome.length()) {
                    longestPalindrome = subStr;
                } else {
                    break outerLoop;
                }
                left -= 1;
                right += 1;
                if (longestPalindrome.length() == s.length()) {
                    return longestPalindrome;
                }
            }

            i += 1;
        }
        if (longestPalindrome != s) {
            i = 0;
            while (i + middle > 0) {
                left = right = middle + i - longestPalindrome.length()/2;
                while (left >= 0 && right <= s.length()) {
                    String subStr = s.substring(left, right);
                    outerLoop2:
                    if (isPalindrome(subStr) && subStr.length() > longestPalindrome.length()) {
                        longestPalindrome = subStr;
                    } else {
                        break outerLoop2;
                    }
                    left -= 1;
                    right += 1;
                    if (longestPalindrome.length() == s.length()) {
                        return longestPalindrome;
                    }
                }

                i -= 1;
            }
        }
        return longestPalindrome;
    }

    public Boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

//Can't quite solve this by expanding from middle