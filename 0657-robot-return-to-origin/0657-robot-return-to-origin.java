class Solution {
    public boolean judgeCircle(String moves) {

        int udCount = 0;
        int rlCount = 0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                udCount = udCount + 1;
            }
            else if(c=='D'){
                udCount = udCount - 1;
            }
            else if(c=='L'){
                rlCount = rlCount + 1;
            }
            else if(c=='R'){
                rlCount = rlCount - 1;
            }
        }

        if(rlCount==0 && udCount==0){
            return true;
        }

        return false;
        
    }
}