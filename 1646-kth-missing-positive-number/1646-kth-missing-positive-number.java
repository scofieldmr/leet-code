class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            int missingNumber = arr[mid] - (mid+1);

            if(missingNumber >= k){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        if(start <= arr.length){
            return k+start;
        }

        return k + arr.length;
    }
}