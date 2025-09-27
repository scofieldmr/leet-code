class Solution {
    public int maxDepth(String s) {

        int maxParCount=0;
        int currParCount=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                currParCount++;
                if (currParCount > maxParCount) {
                    maxParCount = currParCount;
                }
            }
            else if (s.charAt(i) == ')') {
                currParCount--;
            }
        }

        return maxParCount;
        
    }
}