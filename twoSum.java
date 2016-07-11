//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//        You may assume that each input would have exactly one solution.
//        Example:
//        Given nums = [2, 7, 11, 15], target = 9,
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        hMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (map.containsKey(complement)) {
                int [] result = { map.get(complement), i };
                return result;
            }
            map.put(num, i);
        }
        throw new IllegalArgumentException("bad");
    }
};
//
//Time complexity : O(n) traverse the list containing n elements only once. Each look up in the table costs only O(1) time.
//Space complexity : O(n). depends on the number of items stored in the hash table, which stores at most n elements.