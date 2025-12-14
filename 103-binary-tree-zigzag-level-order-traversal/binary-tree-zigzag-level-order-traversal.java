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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return res;
        queue.offer(root);
        boolean leftToright=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            Integer[] sublist=new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                int index;
                if(leftToright){
                    index=i;
                }
                else{
                    index=size-i-1;
                }
                
                sublist[index]=node.val;
                
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            res.add(Arrays.asList(sublist));
            leftToright=!leftToright;
        }
        return res;
        
    }
}