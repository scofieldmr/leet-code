class Solution {
    public String reverseWords(String s) {

        String[] parts = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = parts.length-1; i >=0;i--) {
            if(parts[i].length() > 0){
                String part = parts[i];
                sb.append(part);
                sb.append(" ");
            }
        }

        return sb.toString().trim();


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