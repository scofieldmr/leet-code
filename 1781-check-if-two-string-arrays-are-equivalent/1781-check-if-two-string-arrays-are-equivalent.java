class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();

        for(String w : word1){
            sb1.append(w);
        }

        StringBuilder sb2 = new StringBuilder();

        for(String w1 : word2){
            sb2.append(w1);
        }

        return sb1.toString().equals(sb2.toString());
        
    }
}