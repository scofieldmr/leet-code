class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str1 = strs[0];
        StringBuilder sb = new StringBuilder(str1);

        for (int i = 1; i < strs.length; i++) {
            int k = 0;
            int len = strs[i].length();
            if(len==0){
                sb = new StringBuilder("");
                return sb.toString();
            }
            if(sb.length()>0 && strs[i].length()>=1) {
                for (int j = 0; j < strs[i].length(); j++) {
                    if (j>=sb.length() || strs[i].charAt(j) != str1.charAt(j)) {
                        break;
                    } else {
                        k++;
                    }
                }
                sb = new StringBuilder(sb.substring(0, k));
            }
        }

        return sb.toString();
        
    }
}