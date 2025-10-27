class Solution {
    public int countSegments(String s) {
        if(s==null || s.length()==0) return 0;
        char[] arr=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
           arr[i]=s.charAt(i);
         } 
         int count=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '&& (i==0 || arr[i-1]==' ')) {
                count++;
            }

         } 
         return count;      
           
        
    }
}