class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> chartoword=new HashMap<>();
        HashMap<String,Character> wordtochar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String st=words[i];
            if(chartoword.containsKey(ch)){
                if(!chartoword.get(ch).equals(st)){
                    return false;
                }
            }
                else{
                    chartoword.put(ch,st);
                }
            if(wordtochar.containsKey(st)){
                if(!wordtochar.get(st).equals(ch)){
                    return false;
                }
            }
            else{
                wordtochar.put(st,ch);
            }
        }
        return true;

        
    }
}