class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){ //checks if key already present int hashtable
                int x=map.get(i);
                map.put(i,x+1); //if there then increase the value
            }
            else{
                map.put(i,1); //if not there insert
            }
            
        }
        for(Integer n:map.keySet()){ //checks the value ==1
            if(map.get(n)==1){
                return n;
            }

        }
        return -1;
        
        
    }
}