class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] prefixArray = new int[nums.length];
        int prefix = 1;

        for (int i = 0; i < nums.length; i++) {
            prefixArray[i]=prefix;
            prefix = prefix * nums[i];
        }

        int [] productArray = new int[nums.length];
        int suffix = 1;

        for(int i=nums.length-1;i>=0;i--){
            productArray[i]=prefixArray[i]*suffix;
            suffix = suffix * nums[i];
        }

        return productArray;


        // int[] productArray = new int[nums.length];
        // for(int i = 0; i<nums.length; i++){
        //     int currentProduct = 1;
        //     for(int j = 0; j<nums.length; j++){
        //         if(i!=j){
        //             currentProduct *= nums[j];
        //         }
        //     }
        //     productArray[i] = currentProduct;
        // }

        // return productArray;
        
    }
}