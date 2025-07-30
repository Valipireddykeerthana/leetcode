class Solution {
    public int[] shuffle(int[] nums, int n) {
        // 2*n is used to represent the size of result array
        int [] result=new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i]=nums[i];//return i values in even inndex of result
            result[2*i+1]=nums[i+n];//return i values in odd index of result
            }
            
        return result;
       
        
    }
}