class Solution {
    public int balancedStringSplit(String s) {
        int count = 1;

        int RCount = 0;
        int LCount = 0;

        for(char c: s.toCharArray()){
            if(RCount!=0 && LCount!=0 && RCount==LCount){
                count++;
                RCount = 0;
                LCount = 0;
            }
            if(c == 'L'){
                LCount++;
            }
            else if(c == 'R'){
                RCount++;
            }
        }

        return count;
    }
}