class Solution {
    public String reverseWords(String s) {

         String [] words = s.split(" ");

        StringBuilder builder = new StringBuilder();
        for (int i = words.length-1; i>=0; i--) {
            if(words[i].length() > 0){
                if(i==0){
                    builder.append(words[i]);
                }
                else{
                    builder.append(words[i]+" ");
                }
            }
        }

        return builder.toString().trim();

        // String [] words = s.split(" ");


        // List<String> wordList = new ArrayList<>();
        // StringBuilder reversedString = new StringBuilder();
        // for (String word : words) {
        //     if(word.length()>0){
        //         wordList.add(word);
        //     }
        // }
        // System.out.println(wordList);

        // for(int i = wordList.size(); i >0; i--){
        //     if(i==1){
        //         reversedString.append(wordList.get(i-1));
        //     }
        //     else {
        //         reversedString.append(wordList.get(i-1) + " ");
        //     }
        // }

        // return reversedString.toString();
        
    }
}