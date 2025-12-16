/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<Node> queue=new LinkedList<Node>();
        if(root==null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> sublist=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr=queue.poll();
                sublist.add(curr.val);
                for(Node child:curr.children){
                    queue.offer(child);
                }
            }
            res.add(sublist);
        }
        return res;
        
    }
}