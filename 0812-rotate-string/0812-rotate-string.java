class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        int p = 0;
        while (p < sb.length()) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if(sb.toString().equals(goal)) {
                return true;
            }
            p++;
        }
        return false;
    }
}