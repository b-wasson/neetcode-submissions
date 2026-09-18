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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p,             TreeNode q) {

        TreeNode curr = root; 
        int higherNum = Math.max(p.val, q.val);
        int lowerNum = Math.min(p.val, q.val);

        while(curr != null){
            int currVal = curr.val;

            if(currVal <= higherNum && currVal >= lowerNum){
                return curr; 
            }else if(currVal > higherNum){
                curr = curr.left;
            }else{
                curr = curr.right;
            }   
        }
        return root;
    }
}
