class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;


        while (start < end) {
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start = start + 1;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(end))){
                end = end - 1;
                continue;
            }

            if(Character.isLetterOrDigit(s.charAt(start))
                    && Character.isLetterOrDigit(s.charAt(end))) {
                char c1 = Character.toLowerCase(s.charAt(start));
                char c2 = Character.toLowerCase(s.charAt(end));
                if(c1!= c2) {
                    return false;
                }
            }
            start++;
            end--;
        }

        return true;
    }
}