class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> result=new ArrayList<>();
         HashMap<Integer,Boolean> map=new HashMap<>();
         for(int num:nums){
            map.put(num,true);

         }
         
         for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                result.add(i);
            }
            
         }
         return result;
         
    }
}