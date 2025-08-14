class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int i=2;i<=n;i++){
            int count=1;
            String current="";
            for(int j=1;j<result.length();j++){
                if(result.charAt(j)==result.charAt(j-1)){
                    count++;

                }
                else{
                    current=current+count+result.charAt(j-1);
                    count=1;
                }
                
            }
            result=current+count+result.charAt(result.length()-1);
        }
        return result;
        
    }
}