class Solution {
    public int[] constructRectangle(int area) {
        int b=(int)Math.sqrt(area);  //suppose area is 36 square root 6
        while(area%b!=0){ //if 36 divide by 6 thent the remainder is 0
            b--; // if not then decrease the 6 that means 5,4,3,2,1
        }
        int l=area/b; // 36/6 is 6
        int[] ans=new int[2];// then add to array
        ans[0]=l;
        ans[1]=b;
        return ans;
        
    }
}