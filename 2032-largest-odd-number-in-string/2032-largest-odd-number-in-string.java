class Solution {
    public String largestOddNumber(String num) {
        long nums = Long.parseLong(String.valueOf(num.charAt(num.length()-1)));

        if(nums%2!=0){
            return num;
        }

        StringBuilder sb = new StringBuilder(num);
        int count = 0;
        int maxOdd = 0;
        for (int i=num.length()-1;i>=0;i--) {
            long n = Long.parseLong(String.valueOf(num.charAt(i)));
            if(n%2!=0){
                break;
            }
            else{
                sb.deleteCharAt(i);
            }
        }
        
        return sb.toString();
    }
}