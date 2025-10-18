class Solution {
    public int countCharacters(String[] words, String chars) {

        int [] c = new int [26];
        for(int i=0;i<chars.length();i++){
            int index = chars.charAt(i)-'a';
            c[index] = c[index] + 1;
        }

        int count = 0;

        for(int i=0;i<words.length;i++){
            String st = words[i];
            int curr = 0;
            int [] cd = Arrays.copyOf(c,c.length);
            for(int j=0;j<st.length();j++){
                int index = st.charAt(j)-'a';
                if(cd[index]<=0){
                   break;
                }
                cd[index] = cd[index] -1;
                curr++;
            }
            if(curr == st.length()){
               count = count + st.length();
            }
        }

        return count;
        
    }
}