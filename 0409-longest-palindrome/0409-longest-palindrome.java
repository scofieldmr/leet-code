class Solution {
    public int longestPalindrome(String s) {
        int [] count = new int [128];
        for(char c : s.toCharArray()){
            count[c]++;
        }

        int palCount = 0;
        boolean firstOdd = false;
        for(int c: count){
            palCount = palCount + ((c/2)*2);
            if(c%2==1){
                firstOdd = true;
            }
        }
        if(firstOdd){
            palCount = palCount + 1;
        }

        return palCount;
        //Using separate freq for lower and upper letters
        // int [] scount = new int[26];
        // int [] bcount = new int[26];
        // for(char c : s.toCharArray()){
        //     if(Character.isLowerCase(c)){
        //         scount[c - 'a']++;
        //     }
        //     else{
        //         bcount[c - 'A']++;
        //     }
        // }

        // int palCount = 0;
        // boolean firstOdd = false;
        // for(int i = 0; i < scount.length; i++){
        //     palCount = palCount + ((scount[i]/2) * 2) + ((bcount[i]/2) * 2);
        //     if(scount[i] % 2 == 1 || bcount[i] % 2 == 1){
        //         firstOdd = true;
        //     }
        // }
        // if(firstOdd){
        //     palCount = palCount + 1;
        // }

        // return palCount;
    }
}