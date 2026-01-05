class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:candyType){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int unique=map.size();
        int candies=n/2;
        return Math.min(unique,candies);
    }
}