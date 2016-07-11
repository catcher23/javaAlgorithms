//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//        1
//        / \
//        2   2
//        / \ / \
//        3  4 4  3
//        But the following [1,2,2,null,3,null,3] is not:
//        1
//        / \
//        2   2
//        \   \
//        3    3

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//iterative solution:

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        list.add(root);
        while (!list.isEmpty()) {
            TreeNode t1 = list.poll();
            TreeNode t2 = list.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            list.add(t1.left);
            list.add(t2.right);
            list.add(t1.right);
            list.add(t2.left);
        }
        return true;
    }
}