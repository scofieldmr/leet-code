class Solution {
    public int divide(int dividend, int divisor) {

        return ((dividend/divisor) == Integer.MIN_VALUE) ? (divisor==1)?Integer.MIN_VALUE:Integer.MAX_VALUE:(dividend/divisor);
        // int output = 1;
        // if(divisor == -1 && dividend ==Integer.MIN_VALUE){
        //     output = Integer.MAX_VALUE;
            
        //     return output;
        // }
       
        // return dividend/divisor;
    }
}