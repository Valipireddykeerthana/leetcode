class Solution {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int low=1;
        int high=x;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long square=(long)mid*mid;
            if(x==square){
                return mid;
            }
            else if(x>square){
                ans=mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return ans;
        
    }
}