class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String ans="";
        if(!(str1+str2).equals(str2+str1)){
            return ans;
        }
        int n1=str1.length();
        int n2=str2.length();
        int g=gcd(n1,n2);
        return str1.substring(0,g);
        
        }
        
    
    int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    
}