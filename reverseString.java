//reverse a string
public class Solution {
    public String reverseString(String s) {
        int length = s.length();
        Object[] newStr = new Object[length];
        if (length > 0) {
            for (int x = 0; x <= length / 2; x++) {
                newStr[x] = s.charAt(length - 1 - x);
                newStr[length - 1 - x] = s.charAt(x);
            }
            String listString = new String();
            for (Object c : newStr) {
                listString += c.toString();
            }
            return listString;
        }
        return "";
    }
}