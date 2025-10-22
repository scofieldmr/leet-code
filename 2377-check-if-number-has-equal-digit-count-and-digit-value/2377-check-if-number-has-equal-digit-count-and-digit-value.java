class Solution {
    public boolean digitCount(String num) {
        int[] digits = new int[10];
        for(char c : num.toCharArray()){
            digits[c - '0']++;
        }

       for(int i=0; i<num.length(); i++){
           int dig = num.charAt(i) - '0';
           int numCount = digits[i];
           if(dig != numCount){
               return false;
           }
       }

       return true;
    }
}