class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxprime=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int primary=nums[i][i];
            int secondary=nums[i][n-i-1];
            if(isprime(primary)){
                maxprime=Math.max(maxprime,primary);
            }
            if(isprime(secondary)){
                maxprime=Math.max(maxprime,secondary);
            }
        }
        return maxprime;
    }
        private boolean isprime(int x){
            if(x<2) return false;
            for(int i=2;i*i<=x;i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
    }
}