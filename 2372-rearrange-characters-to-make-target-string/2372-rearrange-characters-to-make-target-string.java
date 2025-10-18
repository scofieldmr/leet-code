class Solution {
    public int rearrangeCharacters(String s, String target) {

        int[] scount = new int[26];
        for(char c: s.toCharArray()){
            scount[c - 'a']++;
        }

        int [] tcount = new int[26];
        for(char c: target.toCharArray()){
            tcount[c - 'a']++;
        }

        int minCount = Integer.MAX_VALUE;
        for (char c: target.toCharArray()) {
           int index = c - 'a';
           minCount = Math.min(minCount, scount[index]/tcount[index]);
        }

        return minCount;
        //using frequency Method
        // int[] scount = new int[26];
        // for(char c: s.toCharArray()){
        //     scount[c - 'a']++;
        // }

        // int count = 0;
        // for(int i=0;i<s.length();i++){
        //     boolean isAvailable = true;
        //     for(char c: target.toCharArray()){
        //         int index = c - 'a';
        //         if(scount[index] == 0){
        //             isAvailable = false;
        //             break;
        //         }
        //         scount[index]--;
        //     }
        //     if(isAvailable){
        //         count = count+1;
        //     }
        //     else{
        //         break;
        //     }
        // }

        // return count;
    }
}