class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=0;
        int totalgas=0;
        int totalcost=0;
        int currentgas=0;
        for(int i=0;i<gas.length;i++){
            totalgas=totalgas+gas[i];
            totalcost=totalcost+cost[i];
            currentgas=currentgas+gas[i]-cost[i];
            if(currentgas<0){
                currentgas=0;
                index=i+1;
            }
        }
        return (totalgas<totalcost)? -1:index;


        
    }
}