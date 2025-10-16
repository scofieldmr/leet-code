class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()){
            return false;
        }

        StringBuilder sb = new StringBuilder(s);
        sb = sb.append(sb);

        return sb.toString().contains(goal);
    }
}