class Solution {
    public int divide(int dividend, int divisor) {
        int output = 1;
        if(divisor == -1 && dividend ==Integer.MIN_VALUE){
            output = Integer.MAX_VALUE;
            
            return output;
        }
       
        return dividend/divisor;
    }
}