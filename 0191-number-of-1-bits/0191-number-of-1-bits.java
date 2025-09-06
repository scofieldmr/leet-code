class Solution {
    public int hammingWeight(int n) {

        int noOf1Bits = 0;

        while (n != 0) {
            int rem = n & 1;
            if (rem == 1) {
                noOf1Bits++;
            }
            n = n >> 1;
        }


        return noOf1Bits;
        
    }
}