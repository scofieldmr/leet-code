class Solution {
    public int valueAfterKSeconds(int n, int k) {

        int [] nums = new int[n];
        int MOD = 1_000_000_007;
        for (int i = 0; i < n; i++) {
            nums[i] = 1;
        }


        for(int i=0; i<k; i++){
            int pref = 1;
            nums[0]=pref;
            for(int j=1; j<n; j++){
                pref = (nums[j]+nums[j-1])%MOD;
                nums[j]=pref;
            }
        }

        return nums[nums.length-1];
        
    }
}