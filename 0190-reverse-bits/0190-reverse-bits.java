class Solution {
    public int reverseBits(int n) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (n != 0) {
            int rem = n & 1;
            sb.append(rem);
            count++;
            n = n >> 1;
        }

        for(int i=count;i<32;i++){
            sb.append("0");
        }


        StringBuilder newNumBinary = sb;

        int revNum = 0;
        int power = 0;
        for (int i = newNumBinary.length()-1; i>=0; i--) {
            int num = newNumBinary.charAt(i)-'0';
            revNum = (int) (revNum + (num * Math.pow(2,power)));
            power = power + 1;
        }

        return revNum;
        
    }
}