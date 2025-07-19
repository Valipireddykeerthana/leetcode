class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
            
        }
        return s.equals(reversed);
        
        
    }
}