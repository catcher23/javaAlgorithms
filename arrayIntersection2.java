import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
//
//Given two arrays, write a function to compute their intersection.
//
//        Example:
//        Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
//
//        Note:
//        Each element in the result should appear as many times as it shows in both arrays.

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums1) {
            count = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, count + 1);
        }
        for (int i : nums2) {
            if (map.containsKey(i)) {
                count = map.get(i);
                if (count > 0) {
                    list.add(i);
                    map.put(i, count - 1);
                }
            }
        }
        int [] result = new int[list.size()];
        int idx = 0;
        for (Integer k : list) {
            result[idx] = k;
            idx += 1;
        }
        return result;
    }
};

// Solution solution = new Solution();
// System.out.println(solution.intersect([1,2,3],[1,2]));
