class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        
        long n = num & 0xFFFFFFFFL;

        char [] ch = "0123456789abcdef".toCharArray();

        StringBuilder sb = new StringBuilder();

        while (n!=0){
            long rem = n % 16;
            sb.append(ch[(int)rem]);
            n /= 16;
        }
        return sb.reverse().toString();

        // return Integer.toHexString(num);
        
    }
}