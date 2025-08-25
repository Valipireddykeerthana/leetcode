class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int x=map.get(i);
                map.put(i,x+1);
            }
            else{
                map.put(i,1);
            }
            
        }
        for(Integer n:map.keySet()){
            if(map.get(n)==1){
                return n;
            }

        }
        return -1;
        
    }
}