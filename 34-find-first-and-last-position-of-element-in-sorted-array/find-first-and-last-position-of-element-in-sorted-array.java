class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1){
                    first =i;

                }
                
                last=i;
                
            }
        }
        int[] result=new int[2];
        result[0]=first;
        result[1]=last;
        return result;
        
    }
}