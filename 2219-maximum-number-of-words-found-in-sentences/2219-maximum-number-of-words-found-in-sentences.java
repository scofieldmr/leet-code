class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxLength = 0;
        for(String s :sentences){
            String [] parts = s.split(" ");
            int len = parts.length;
            if(len>maxLength){
                maxLength=len;
            }
        }

        return maxLength;
    }
}