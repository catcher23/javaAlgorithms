public class Solution {
    public int addDigits(int num) {
        String numStr = Integer.toString(num);
        if (numStr.length() <= 1) {
            return num;
        }

        while (true) {
            int newNum = 0;
            for (int x = 0; x < numStr.length(); x++) {
                String number = String.valueOf(numStr.charAt(x));
                newNum = Integer.parseInt(number) + newNum;
            }
            if (Integer.toString(newNum).length() == 1) {
                return newNum;
            }
            numStr = Integer.toString(newNum);
        }
    }
}