class Solution {
    public int maxFrequencyElements(int[] nums) {
     
        int max=0;
        int result=0;
        
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
            boolean counted[]=new boolean[nums.length];
            for(int i=0;i<nums.length;i++){
                int count=1;
                if(counted[i]) continue;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                        counted[j]=true;
                    }
                
            }
            if(count==max){
                result=result+count;
            }

        }
        return result;
        
        
    }
}