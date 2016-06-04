//Given two arrays, write a function to compute their intersection.
//Example:
//        Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].



public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> result = new HashSet<>();
    Set<Integer> set = new HashSet<>();
    for (int i : nums1) {
        set.add(i);
    }
    for (int j : nums2) {
        if (set.contains(j)) {
            result.add(j);
        }
    }
    int[]res = new int[result.size()];
    int idx = 0;
    for (Integer k : result) {
        res[idx] = k.intValue();
        idx += 1;
    }
    return res;
}

//0(n)