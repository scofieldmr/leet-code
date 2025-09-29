class Solution {
    public int findKthPositive(int[] arr, int k) {
    int missingCount = 0; 
    int prev = 0; 

    for (int num : arr) {
        int gap = num - prev - 1; 
        if (missingCount + gap >= k) {
            return prev + (k - missingCount);
        }
        missingCount += gap;
        prev = num;
    }

    return arr[arr.length - 1] + (k - missingCount);
    }
}