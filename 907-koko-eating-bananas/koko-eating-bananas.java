class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<high){
            int mid=(low+high)/2;
            int total=0;
            for(int pile:piles){
            total+=(pile/mid);
            if(pile % mid!=0){
                total++;
            }
            }
            if(total<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low; 
    }
}