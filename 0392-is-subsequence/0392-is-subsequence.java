class Solution {
    public boolean isSubsequence(String s, String t) {

        // int i = 0, j = 0;

        // while (i < s.length() && j < t.length()) {
        //     if (s.charAt(i) == t.charAt(j)) {
        //         i++;
        //     }
        //     j++;
        // }

        // return i == s.length();

        int k=0;
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
           for(int j = k ;j<t.length();j++){
               if(s.charAt(i)==t.charAt(j)){
                   flag=true;
                   k++;
                   break;
               }
               k++;
           }
           if(!flag){
                return false;
            }
        }

        return true;
        
    }
}