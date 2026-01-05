class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int n=score.length;
        String[] ans=new String[n];
        int[] sc=score.clone();
        Arrays.sort(sc);
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=n-1;i>=0;i--){
            res.put(sc[i], n-i);
        }
        for(int i=0;i<n;i++){
            int r=res.get(score[i]);
            if(r==1) ans[i]="Gold Medal";
            else if(r==2) ans[i]="Silver Medal";
            else if(r==3) ans[i]="Bronze Medal";
            else ans[i]=String.valueOf(r);
        }
        return ans;
    }
}