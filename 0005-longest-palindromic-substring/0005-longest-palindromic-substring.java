class Solution {
    public String longestPalindrome(String s) {
        
        String rs = "";
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String s1 = s.substring(i,j);
                if(isPalindrome(s1)){
                    if(s1.length()>rs.length()){
                        rs = s1;
                    }
                }
            }
        }

        return rs;
    
    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }

        return true;
    }
}