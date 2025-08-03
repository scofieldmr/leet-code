class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> mapCount = new HashMap<>();
        mapCount.put(0,1);

        int currentSum=0;
        int count = 0;

        for(int n : nums){
            currentSum = currentSum+n;

            if(mapCount.containsKey(currentSum-k)){
                count = count + mapCount.get(currentSum-k);
            }

            mapCount.put(currentSum,mapCount.getOrDefault(currentSum,0)+1);
        }

        return count;
 
        
        // for(int i=0;i<nums.length;i++){
        //    long subSum = 0;
        //    for(int j=i;j<nums.length;j++){
        //       subSum = subSum + nums[j];

        //       if(subSum==k){
        //         count++;
        //       }
        //     }
        // }

        // return count;
        
    }
}