class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans=new ArrayList<>();
        int m=0;
        for(int n:candies){
            m=Math.max(m,n);  
        }
        for(int n:candies){
            if(n+extraCandies>=m){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
        
    }
}