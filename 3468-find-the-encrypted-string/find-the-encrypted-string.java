class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        k=k%n;
        //substring is used to letters between them
        return (s+s).substring(k,k+n);
       

        

        
    }
}