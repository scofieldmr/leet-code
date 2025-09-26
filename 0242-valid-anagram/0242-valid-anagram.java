class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);

        // int[] count = new int[26];

        // for(int i=0;i<s.length();i++){
        //     int index = s.charAt(i)-'a';
        //     count[index]= count[index]+1;
        // }

        // for(int i=0;i<t.length();i++){
        //    int index = t.charAt(i)-'a';
        //    count[index] = count[index]-1;
        // }

        // for(int i=0;i<count.length;i++){
        //     if(count[i]!=0){
        //         return false;
        //     }
        // }

        // return true;
        
    }
}