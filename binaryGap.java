//binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both
//ends in the binary representation of N. For example, number 9 has binary representation 1001 and contains a binary gap
// of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and
// one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15
// has binary representation 1111 and has no binary gaps.
//
// Write a function that, given a positive integer N, returns the length of its longest binary gap. The function should
// return 0 if N doesn't contain a binary gap. For example, given N = 1041 the function should return 5, because N has
// binary representation 10000010001 and so its longest binary gap is of length 5.

class Solution {
    public int solution(int N) {
        String str = Integer.toBinaryString(N);
        int counter = 0;
        int largestGap = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                counter += 1;
            } else {
                if (counter > largestGap) {
                    largestGap = counter;
                }
                counter = 0;
            }
        }
        return largestGap;
    }
}