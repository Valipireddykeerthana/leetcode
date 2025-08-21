class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            int n1=nums[left]*nums[left];
            int n2=nums[right]*nums[right];
            if(n1>n2){
                result[i]=n1;
                left++;
            }else{
                result[i]=n2;
                right--;
            }
        }
        return result;
    }
}