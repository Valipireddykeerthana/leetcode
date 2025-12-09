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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
         return depth(root.left,root.right);
        
    }
    private int depth(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null) return 1;
        if(t1!=null && t2==null) return 1+minDepth(t1);
        if(t1==null && t2!=null) return 1+minDepth(t2);
        int leftdepth=minDepth(t1);
        int rightdepth=minDepth(t2);
        int mindepth=Math.min(leftdepth,rightdepth);
        return 1+mindepth;
    }
}