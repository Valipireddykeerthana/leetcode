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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return maxsum;
        
    }
    int sum(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,sum(root.left));
        int right=Math.max(0,sum(root.right));
        maxsum=Math.max(maxsum,left+right+root.val);
        return Math.max(left,right)+root.val;

    }
}