class Solution {
    public int[] constructRectangle(int area) {
        int b=(int)Math.sqrt(area);
        while(area%b!=0){
            b--;
        }
        int l=area/b;
        int[] ans=new int[2];
        ans[0]=l;
        ans[1]=b;
        return ans;
        
    }
}