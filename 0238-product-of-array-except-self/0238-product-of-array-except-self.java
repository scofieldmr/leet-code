class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        int prefix = 1;
        for(int i=0;i<nums.length;i++){
            answer[i]=prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*suffix;
            suffix = suffix*nums[i];
        }

        return answer;

       
    }
}

        // int [] newNums = new int[nums.length];
    
        // for(int i=0;i<nums.length;i++){
        //     int tempProd = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j){
        //           continue;
        //         }
        //         tempProd = tempProd*nums[j];
        //     }
        //     newNums[i] = tempProd;
        // }

        // return newNums;