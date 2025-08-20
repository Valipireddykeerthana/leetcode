class Solution {
    public String[] findWords(String[] words) {
        String firstrow="qwertyuiop";
        String secondrow="asdfghjkl";
        String thirdrow="zxcvbnm";
        List<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            int j=0;
            String row="";
            if(firstrow.indexOf(word.charAt(0))!=-1){
                row=firstrow;
            }
            else if(secondrow.indexOf(word.charAt(0))!=-1){
                row=secondrow;

            }
            else{
                row=thirdrow;
            }
            boolean value=true;
            while(j<word.length()){
                if(row.indexOf(word.charAt(j))==-1){
                    value=false;
                    break;
                }
                j++;
                
                }
                if(value){
                    result.add(words[i]);
            }
        }
            return result.toArray(new String[0]);
        
    }
}