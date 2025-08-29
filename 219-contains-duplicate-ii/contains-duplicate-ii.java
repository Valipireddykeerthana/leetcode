class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){ //checks the table contains no.
                if(i-map.get(nums[i])<=k){ //present index-previous index is less and equal to k
                    return true;
                }
            }
            map.put(nums[i],i);  //if no. is not there insert the no. and its index in to the table
        }
        return false;
    }
}