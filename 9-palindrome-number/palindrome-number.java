class Solution {
    public boolean isPalindrome(int x) {
        //palindrome never prints negative values
        if(x<0){
            return false;
        }
        
       int reverse=0;
       int temp=x;
       while(temp>0){
        reverse=reverse*10+(temp%10);
        temp=temp/10;
       }
       return reverse==x;
        
    }
}