class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

         int currentNum = 0;
        int maxCount = 0;
        int currCount = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()>=0 && entry.getKey()==currentNum){
                currCount++;
                currentNum = entry.getKey();
            }
            else if(entry.getKey()==currentNum+1){
                currCount++;
                currentNum = entry.getKey();
            }
            else if(entry.getKey()<0 && entry.getKey()==currentNum+1){
                currentNum = entry.getKey();
                currCount++;
            }
            else{
                currentNum = entry.getKey();
                currCount=1;
            }
            if(currCount>maxCount){
                maxCount = currCount;
            }
        }

        return maxCount;
    }
}