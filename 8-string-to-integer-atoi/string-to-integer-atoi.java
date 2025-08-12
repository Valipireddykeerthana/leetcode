class Solution {
    public int myAtoi(String s) {
        s=s.trim(); //remove spaces
        if(s.isEmpty()){
            return 0;
        }
        int sign=1;
        long result=0;
        int i=0;
        if(s.charAt(0)=='-'){ //if index 0 has - keep the result as -
            sign= -1;
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            //in case we donot traversed at last and we have digits in ith index
            result=result*10+(s.charAt(i)-'0');
            //0*10+4=4
            //4*10+2=42
        
        if(sign*result>Integer.MAX_VALUE) return Integer.MAX_VALUE;//checking the number is greater than 2^31
        if(sign*result<Integer.MIN_VALUE) return Integer.MIN_VALUE;//checking the number is less than -2^31
        i++;
        }
        return (int)(sign*result);
    
        
    }
}