class Solution {
    public int arrangeCoins(int n) {

        int start = 1;
        int end = n;
        
        while(start<=end){
            int mid = start + (end - start)/2;

            long arr = (long) mid * (mid+1)/2;

            if(arr == n){
                return mid;
            }

            if(arr > n) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return end;
        // int i = 1;
        // int count = 0;

        // while(n>0){
        //     n = n - i;
        //     if(n>=0){
        //         count++;
        //     }
        //     i++;
        // }
        // return count;
    }
}