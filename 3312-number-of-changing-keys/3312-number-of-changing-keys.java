class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();
        char ch1 = s.charAt(0);


        for(int i=1;i<s.length();i++){
            char ch2 = s.charAt(i);
            if(ch1!=ch2){
                count++;
                ch1 = ch2;
            }
        }

        return count;
    }
}