class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            } else{
                map.put(n,1);
            }
        }
        for(int i=0;i<k;i++){
        int maxcount=0;
        int maxkey=0;
        for(Integer key:map.keySet()){
            int count=map.get(key);
            if(count>maxcount){
                maxcount=count;
                maxkey=key;
            }
        }
        ans[i]=maxkey;
        map.remove(maxkey);
    }
        return ans;
    }
}