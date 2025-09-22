class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        int count = 0;
        int maxOdd = 0;
        for (int i=num.length()-1;i>=0;i--) {
            int n = sb.charAt(i)-'0';
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