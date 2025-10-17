class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int [] rnote = new int [26];
        for(int i=0;i<ransomNote.length();i++){
            int index = ransomNote.charAt(i)-'a';
            rnote[index] = rnote[index] + 1;
        }

        int [] mnote = new int [26];
        for(int i=0;i<magazine.length();i++){
            int index = magazine.charAt(i)-'a';
            mnote[index] = mnote[index] + 1;
        }

        for(int i=0;i<rnote.length;i++){
            int val = rnote[i]-mnote[i];
            if(val<=0){
                rnote[i] = 0;
            }
        }

        for(int i=0;i<rnote.length;i++){
            if(rnote[i]!=0){
                return false;
            }
        }

        return true;
    }
}