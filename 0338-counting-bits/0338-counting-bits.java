class Solution {
    public int[] countBits(int n) {
        int [] noOf1Bits = new int[n+1];

        for (int i = 0; i <= n; i++) {
            noOf1Bits[i] = countingBits(i);
        }
        
        return noOf1Bits;
    }

     static int countingBits(int n) {
        int count = 0;
        while (n!=0){
            int rem = n&1;
            if(rem==1){
                count++;
            }
            n = n>>1;
        }
        return count;
      }
}