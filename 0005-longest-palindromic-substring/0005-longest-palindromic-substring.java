class Solution {
    public String longestPalindrome(String s){
       if (s == null || s.length() < 1) {
         return "";
       }

       int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = palLength(s, i, i);
            int len2 = palLength(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int palLength(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; 
    }
}
//     public String longestPalindrome(String s) {
        
//         StringBuilder rs = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++){
//                 String s1 = s.substring(i,j);
//                    if(isPalindrome(s1)){
//                     if(s1.length()>rs.length()){
//                         rs = new StringBuilder(s1);
//                     }
//                 }
//             }
//         }

//         return rs.toString();
    
//     }

//     public boolean isPalindrome(String s){
//         int left = 0;
//         int right = s.length()-1;

//         while(left<right){
//             if(s.charAt(left)!=s.charAt(right)){
//                 return false;
//             }
//             else{
//                 left++;
//                 right--;
//             }
//         }

//         return true;
//     }
// }