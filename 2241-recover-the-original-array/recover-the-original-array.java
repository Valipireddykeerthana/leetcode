import java.util.*;

class Solution {
    public int[] recoverArray(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 1; i < n; i++){

            int diff = nums[i] - nums[0];

            if(diff == 0 || diff % 2 != 0) continue;

            int k = diff / 2;

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int num : nums){
                map.put(num, map.getOrDefault(num,0) + 1);
            }

            int[] original = new int[n/2];
            int index = 0;

            for(int num : nums){

                if(map.get(num) == 0) continue;

                int target = num + 2*k;

                if(map.getOrDefault(target,0) == 0){
                    index = 0;
                    break;
                }

                original[index++] = num + k;

                map.put(num, map.get(num)-1);
                map.put(target, map.get(target)-1);
            }

            if(index == n/2) return original;
        }

        return new int[0];
    }
}