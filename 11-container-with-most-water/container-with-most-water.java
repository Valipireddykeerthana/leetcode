class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            int res=(right-left)*Math.min(height[left],height[right]);
            ans=Math.max(ans,res);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }
}