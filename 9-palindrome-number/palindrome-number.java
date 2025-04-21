class Solution {
    public boolean isPalindrome(int x) {
        //palindrome never prints negative values
        if(x<0){
            return false;
        }
        //changes integer to string
        String str=Integer.toString(x);
        //it is about indicies
        int left=0;
        int right=str.length()-1;
        while(left<right){
            //it prints characters of the index
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
                  
        }
        return true;
        
    }
}