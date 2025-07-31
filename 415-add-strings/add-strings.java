class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length()-1;
         int l2=num2.length()-1;
         int carry=0;
         String ans="";
         while(l1>=0 || l2>=0 || carry!=0){
            int sum=carry;
            if(l1>=0){
                sum=sum+num1.charAt(l1)-'0';
                l1--;
            }
            if(l2>=0){
                sum=sum+num2.charAt(l2)-'0';
                l2--;
            }
            ans=Integer.toString(sum%10)+ans;
            carry=sum/10;
         }
         return ans;
    }
}