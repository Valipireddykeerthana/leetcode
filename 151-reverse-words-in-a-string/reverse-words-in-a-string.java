class Solution {
    public String reverseWords(String s) {
        
        String []array=s.trim().split("[,\\s]+");
        String result="";
        int n=array.length;
        for(int i=n-1;i>0;i--){
            result=result+array[i]+" ";
        }
        return result+array[0];
    }
}