class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int j=0;
        while(i<n){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                i++;
                count++;
            }
            chars[j]=ch;
            j++;
            if(count>1){
                for(char c:Integer.toString(count).toCharArray()){
                    chars[j]=c;
                    j++;
                }
            }
        }
        return j;
        
    }
}