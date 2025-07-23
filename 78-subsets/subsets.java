class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        backtrack(0,nums,result,current);
        return result;
    }
        private void backtrack(int index,int[] nums,List<List<Integer>> result,List<Integer> current){
            result.add(new ArrayList<>(current));
            for(int i=index;i<nums.length;i++){
                current.add(nums[i]);
                backtrack(i+1,nums,result,current);
                current.remove(current.size()-1);
            }
        }

        
    
}