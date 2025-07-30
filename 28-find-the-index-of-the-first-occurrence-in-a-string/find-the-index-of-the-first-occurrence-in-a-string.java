class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        //here if we take example as "abcdefg" and needle contains "def" 
        //n=7,m=3,n-m=4,here we check every 3 letters like "abc","def","g",hence we find at index 2
        for(int i=0;i<=n-m;i++){
            String sub=haystack.substring(i,i+m);
            if(sub.equals(needle)){
                return i;

            }
            
        }
        return -1;
            
        
    }
}