class Solution {
    public boolean isBalanced(String num) {
        int even=0;
        int odd=0;
        int n=num.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even=even+(num.charAt(i)-'0');
                

            }
            else{
                odd=odd+(num.charAt(i)-'0');
            }
        }
        return even==odd;
        
    }
}