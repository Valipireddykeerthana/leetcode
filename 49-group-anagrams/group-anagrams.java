class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String b=new String(a);
            if(!map.containsKey(b)){
                map.put(b,new ArrayList<>());
            }
            
            map.get(b).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}