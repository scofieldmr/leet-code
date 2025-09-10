class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length<=0){
            return 0;
        }

        Arrays.sort(nums);

        int currentNum = nums[0];
        int currCount = 1;
        int maxCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==currentNum+1 ) {
                currentNum = nums[i];
                currCount++;
           }
            else if(nums[i]==currentNum) {
                currentNum = nums[i];
            }
            else {
                currentNum = nums[i];
                if(currCount>maxCount) {
                    maxCount = currCount;
                }
                currCount = 1;
            }
        }
        return currCount>maxCount?currCount:maxCount;
        // Map<Integer,Integer> map = new TreeMap<>();

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // int currentNum = 0;
        // int maxCount = 0;
        // int currCount = 0;
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getKey()>=0 && entry.getKey()==currentNum){
        //         currCount++;
        //         currentNum = entry.getKey();
        //     }
        //     else if(entry.getKey()==currentNum+1){
        //         currCount++;
        //         currentNum = entry.getKey();
        //     }
        //     else if(entry.getKey()<0 && entry.getKey()==currentNum+1){
        //         currentNum = entry.getKey();
        //         currCount++;
        //     }
        //     else{
        //         currentNum = entry.getKey();
        //         currCount=1;
        //     }
        //     if(currCount>maxCount){
        //         maxCount = currCount;
        //     }
        // }

        // return maxCount;
    }
}