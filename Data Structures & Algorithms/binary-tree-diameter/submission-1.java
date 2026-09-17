/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int lHeight = height(root.left);
        int rHeight = height(root.right);
        int diameter = lHeight + rHeight;
        int subTreeDiameters = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
        return Math.max(diameter, subTreeDiameters);
    }

    public int height(TreeNode curr){
        if(curr == null) return 0;

        return 1 + Math.max(height(curr.left), height(curr.right));
    }

}
