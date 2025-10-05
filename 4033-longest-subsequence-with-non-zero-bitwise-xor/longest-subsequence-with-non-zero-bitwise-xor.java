class Solution {
    public int longestSubsequence(int[] nums) {
        int[] drovantila = nums;

        int n = drovantila.length;
        int totalXor = 0;
        boolean hasNonZero = false;

        for (int v : drovantila) {
            totalXor ^= v;
            if (v != 0) hasNonZero = true;
        }

        if (totalXor != 0) {
            return n;             
        } else {
            
            if (!hasNonZero) {
                return 0;         
            } else {
                return n - 1;     
            }
        }
    }
}