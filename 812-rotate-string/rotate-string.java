class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String right=s+s;
        return right.contains(goal);

        
    }
}