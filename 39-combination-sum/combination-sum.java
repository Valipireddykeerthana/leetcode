class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),res);
        return res;
        
    }
    private void backtrack(int[] candidates,int target,int start,List<Integer> current,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        if(target<0) return;
        for(int i=start;i<candidates.length;i++){
            current.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,current,res);
            current.remove(current.size()-1);

        }
    }
}