class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        String v="aeiouAEIOU";
        char[] ans=s.toCharArray();
        while(left<right){
            while(left<right && v.indexOf(ans[left])==-1){
                left++;
            }
            while(left<right && v.indexOf(ans[right])==-1){
                right--;
            }
            char temp=ans[left];
            ans[left]=ans[right];
            ans[right]=temp;
            left++;
            right--;
        }
        return new String(ans);
        
    }
}