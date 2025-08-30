class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(word.equals(word.toUpperCase())){
            return true;
        }
        String frst=word.substring(0, 1);  //start at index 0 and stops at index 1
        String remain=word.substring(1); //start at index 1 and ends at last
        if(frst.equals(frst.toUpperCase()) && remain.equals(remain.toLowerCase())){
            return true;
        }
        return false;
        
    }
}