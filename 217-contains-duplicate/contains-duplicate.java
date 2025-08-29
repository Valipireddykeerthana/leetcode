class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                int x=map.get(n);
                map.put(n,x+1);
            }else{
                map.put(n,1);
            }
        }
        for(Integer i:map.keySet()){
            if(map.get(i)>1){
                return true;
            }
        }
        
        return false;
        
        
    }
}