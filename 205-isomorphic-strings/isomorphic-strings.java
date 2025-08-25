class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> ans1=new HashMap<>();
        HashMap<Character,Character> ans2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(ans1.containsKey(c1)){
                if(ans1.get(c1)!=c2){
                    return false;
                }
            }
            else {
                ans1.put(c1,c2);
            }
            if(ans2.containsKey(c2)){
                if(ans2.get(c2)!=c1){
                    return false;
                }
            }
            else{ 
                ans2.put(c2,c1);
            }

        }
        return true;


        
    }
}