class Solution {
    public String longestCommonPrefix(String[] strs) {

         String str1 = strs[0];
        StringBuilder sb = new StringBuilder(str1);

        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length()==0){
                return "";
            }
            int k = 0;

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

      
        