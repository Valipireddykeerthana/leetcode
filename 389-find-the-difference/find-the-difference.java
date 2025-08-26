class Solution {
    public char findTheDifference(String s, String t) {
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
       int i=0;
       
       while(i<sarr.length && i<tarr.length){
       if(sarr[i]==tarr[i]){
            i++;
        }else{
            return tarr[i];
        }
        
       }
       return tarr[tarr.length-1];
        
    }
}