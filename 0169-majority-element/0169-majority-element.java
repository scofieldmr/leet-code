class Solution {
    public int majorityElement(int[] nums) {

        int element=0;
        int count=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]==element){
                count++;
            } else if (count==0) {
                element=nums[i];
            } else{
                count--;
            }
        }

        return element;

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num,map.getOrDefault(num,0) + 1);
        // }
        // int max = Integer.MIN_VALUE;
        // int maxKey = Integer.MIN_VALUE;
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue() > max){
        //         max = entry.getValue();
        //         maxKey = entry.getKey();
        //     }
        // }

        // return maxKey;
        
    }
}

//    int maxCount = Integer.MIN_VALUE;
//         int maxCountValue = Integer.MIN_VALUE;
//         for(int i=0;i< nums.length;i++){
//             int count=0;
//              for(int j=i;j<nums.length;j++){
//                  if(nums[i]==nums[j]){
//                      count++;
//                  }
//              }
//              if(count>maxCount){
//                  maxCount=count;
//                  maxCountValue=nums[i];
//              }
//         }

//         return maxCountValue;