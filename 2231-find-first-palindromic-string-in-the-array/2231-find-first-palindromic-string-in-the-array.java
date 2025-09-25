class Solution {
    public String firstPalindrome(String[] words) {

        for(String s:words){
            if(palindrome(s)){
                return s;
            }
        }

        return "";
        
    }

    public static boolean palindrome(String word){
        int left = 0;
        int right = word.length()-1;

        while(left<right){
            if(word.charAt(left)==word.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}