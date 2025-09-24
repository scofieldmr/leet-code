class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> numList = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
             }

            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left]+nums[right];
                if(sum==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[left],nums[right]);
                    numList.add(list);
                    while (left < right && nums[left] == nums[left + 1]){
                         left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        return numList;

        // for(int i=0; i<nums.length; i++){
        //     int firstNum = nums[i];
        //     int sum = firstNum;
        //     for(int j=i+1; j<nums.length; j++){
        //         int secondNum = nums[j];
        //         sum += secondNum;
        //         for(int k=j+1; k<nums.length; k++){
        //             int thirdNum = nums[k];
        //             sum += thirdNum;
        //             if(sum==0){
        //                 List<Integer> list = Arrays.asList(firstNum,secondNum,thirdNum);
        //                 if(!numList.contains(list)){
        //                     numList.add(list);
        //                 }
        //             }
        //             sum = sum - thirdNum;
        //         }
        //         sum = sum -secondNum;
        //     }
        // }

        // return numList;
        
    }
}