class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sorted[]=arr.clone();
        Arrays.sort(sorted);
        int chunks=0;
        int sumOriginal=0;
        int sumSorted=0;
        for(int i=0;i<arr.length;i++){
           sumOriginal+=arr[i];
           sumSorted+=sorted[i];
           if(sumOriginal==sumSorted){
            chunks++;
           }
        }
        return chunks;
        
        
    }
}