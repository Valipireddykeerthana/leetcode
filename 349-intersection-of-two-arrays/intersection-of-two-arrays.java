class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    boolean exist=false;
                    for(int x=0;x<k;x++){
                        if(arr[x]==nums1[i]){
                            exist=true;
                            break;
                        }
                    }
                    if(!exist){
                        arr[k++]=nums1[i];

                    }
                    break;
                }
            }
        } 
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i];
        }
        return res;
            
        
        
    }
}