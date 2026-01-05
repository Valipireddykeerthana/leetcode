class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int i=1;
        while(k>0){
            if(!set.contains(i)){
                k--;
                if(k==0){
                    return i;
                }
            }
            i++;
        } 
        return -1;   
    }
}