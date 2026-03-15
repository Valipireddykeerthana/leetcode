class Solution {
    public int missingNumber(int[] nums) {
        int ans=nums.length;
        int sum=0;
        ans=(ans*(ans+1))/2;
        
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
          
            
        }
        return ans-sum;

    }
}