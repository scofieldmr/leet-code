class Solution {
    public int maxProduct(int[] nums) {

    int n = nums.length;
    int maxProduct = Integer.MIN_VALUE;
    int frontProduct = 1;
    int backProduct = 1;

    for (int i = 0; i < n; i++) {
        frontProduct = (frontProduct == 0 ? 1 : frontProduct) * nums[i];
        backProduct = (backProduct == 0 ? 1 : backProduct) * nums[n - 1 - i];

        maxProduct = Math.max(maxProduct, Math.max(frontProduct, backProduct));
        // also check the single element itself
        maxProduct = Math.max(maxProduct, Math.max(nums[i], nums[n - 1 - i]));
    }

    return maxProduct;
    }
}