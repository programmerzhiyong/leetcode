package leetcode.problem_513;


import definition.TreeNode;

public class Solution {
    private int curHeight = 0;
    private int currVal = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return currVal;
    }

    public void dfs(TreeNode node, int height) {
        if (node == null) return;
        height++;

        dfs(node.left, height);
        dfs(node.right, height);
        if (height > curHeight) {
            curHeight = height;
            currVal = node.val;
        }
    }
}
