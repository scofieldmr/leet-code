class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int minSoFar = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentProduct = nums[i];

            if(currentProduct<0){
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(currentProduct,maxSoFar * currentProduct);
            minSoFar = Math.min(currentProduct,minSoFar * currentProduct);

            maxProduct = Math.max(maxProduct,maxSoFar);
        }

        return maxProduct;

    // int n = nums.length;
    // int maxProduct = Integer.MIN_VALUE;
    // int frontProduct = 1;
    // int backProduct = 1;

    // for (int i = 0; i < n; i++) {
    //     frontProduct = (frontProduct == 0 ? 1 : frontProduct) * nums[i];
    //     backProduct = (backProduct == 0 ? 1 : backProduct) * nums[n - 1 - i];

    //     maxProduct = Math.max(maxProduct, Math.max(frontProduct, backProduct));
    //     maxProduct = Math.max(maxProduct, Math.max(nums[i], nums[n - 1 - i]));
    // }

    // return maxProduct;
    }
}