class Solution {
    public int countCharacters(String[] words, String chars) {

        int [] c = new int [26];
        for(char ch : chars.toCharArray()){
            c[ch -'a']++;
        }

        int count = 0;

        
        for(String w: words){
            int [] temp = new int[26];

            for(int j=0;j<w.length();j++){
                temp[w.charAt(j)-'a']++;
            }
            
            boolean canForm = true;

            for(int j=0;j<temp.length;j++){
                if(temp[j]>c[j]){
                    canForm = false;
                    break;
                }
            }

            if(canForm){
                count = count + w.length();
            }
        }

        return count;
        
    }
}

//Using the array copy method to check
        // for(String w : words){
        //     String st = w;
        //     int curr = 0;
        //     int [] cd = Arrays.copyOf(c,c.length);
        //     for(int j=0;j<st.length();j++){
        //         int index = st.charAt(j)-'a';
        //         if(cd[index]<=0){
        //            break;
        //         }
        //         cd[index] = cd[index] -1;
        //         curr++;
        //     }
        //     if(curr == st.length()){
        //        count = count + st.length();
        //     }
        // }

        // return count;