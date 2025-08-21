class Solution {
    public int strStr(String haystack, String needle) {
       
       int m=haystack.length();
       int n=needle.length();
       if(m<n){
        return -1;
       }
       int i=0;
       int j=0;
       
       while(i<m){
        if(haystack.charAt(i)==needle.charAt(j)){
            i++;
            j++;
            if(j==n){
                return i-n;
            }
        }
        else{
                i=i-j+1;
                j=0;
            }
            if(i+n-j>m){
                return -1;
            }        
        }
    
      return -1;
    
}
}