class Solution {
    public boolean checkIfPangram(String sentence) {

        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }

        return true;
        
        // int [] count = new int [26];
        // for(int i=0;i<sentence.length();i++){
        //    int index = sentence.charAt(i)-'a';
        //    count[index]++;
        // }

        // for(int i = 0;i<count.length;i++){
        //     if(count[i]==0){
        //         return false;
        //     }
        // }

        // return true;
    }
}