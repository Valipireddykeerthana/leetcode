import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        //importing the values from hashmap
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        //we have to start changing from last
        int result=hm.get(s.charAt(s.length()-1));
        //and we dont need to compare the last number so we start from last second number
        for(int i=s.length()-2;i>=0;i--){
            //if index last is large than last second then subtract
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
                 result=result-hm.get(s.charAt(i));
            }
            else{
                //if index last is small than last second then add
                result=result+hm.get(s.charAt(i));
            }
        }
        return result;
        } 
    }
