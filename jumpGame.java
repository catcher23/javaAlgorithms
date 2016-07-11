//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//        Each element in the array represents your maximum jump length at that position.
//
//        Determine if you are able to reach the last index.
//
//        For example:
//        A = [2,3,1,1,4], return true.
//
//        A = [3,2,1,0,4], return false.

public class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        int lastGoodPos = lastPos;
        for (int i = lastPos; i >= 0; i--) {
            lastGoodPos = i + nums[i] >= lastGoodPos ? i : lastGoodPos;
        }
        return lastGoodPos == 0;
    }
}